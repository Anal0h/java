package src.main.java.set;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyHashSet<E> implements BaseSet<E> {

  private static final int DEFAULT_CAPACITY = 1 << 4;
  private static final int MAX_CAPACITY = 1 << 30;
  private static final float LOAD_FACTOR = 0.75f;

  private Node<E>[] table;
  private int size;
  private final float loadFactor;
  private int threshold;

  private static int hash(Object key) {
    return key.hashCode();
  }

  public MyHashSet() {
    this.loadFactor = LOAD_FACTOR;
  }

  @SuppressWarnings("unchecked")
  private void resize() {
    int newCapacity = table.length * 2;
    if (newCapacity > MAX_CAPACITY) {
      newCapacity = MAX_CAPACITY;
    }
    Node<E>[] newTable = new Node[newCapacity];
    threshold = (int) (newCapacity * loadFactor);
    if (newCapacity == MAX_CAPACITY) {
      threshold = newCapacity;
    }
    for (Node<E> node : table) {
      while (node != null) {
        Node<E> next = node.next;
        int hash = hash(node.hash);
        node.next = newTable[hash];
        newTable[hash] = node;
        node = next;
      }
    }
    table = newTable;
  }

  @SuppressWarnings("unchecked")
  @Override
  public void add(E e) {
    if (table == null) {
      table = new Node[DEFAULT_CAPACITY];
      threshold = (int) (DEFAULT_CAPACITY * loadFactor);
    }
    if (size >= threshold) {
      resize();
    }
    int index = hash(e) & (table.length - 1);
    Node<E> node = table[index];
    while (node != null) {
      if (node.key.equals(e)) {
        return;
      }
      node = node.next;
    }
    Node<E> newNode = new Node<>(hash(e), e, table[index]);
    table[index] = newNode;
    size++;
  }


  @Override
  public void remove(Object o) {
    if (table == null) {
      return;
    }
    int index = hash(o) & (table.length - 1);
    Node<E> node = table[index];
    Node<E> prev = null;
    while (node != null) {
      if (node.key.equals(o)) {
        if (prev == null) {
          table[index] = node.next;
        } else {
          prev.next = node.next;
        }
        size--;
        return;
      }
      prev = node;
      node = node.next;
    }
  }


  @Override
  public void clear() {
    if (table == null) {
      return;
    }
    Arrays.fill(table, null);
    size = 0;
  }

  @Override
  public boolean contains(Object o) {
    if (table == null) {
      return false;
    }
    int index = hash(o) & (table.length - 1);
    Node<E> node = table[index];
    while (node != null) {
      if (node.key.equals(o)) {
        return true;
      }
      node = node.next;
    }
    return false;
  }

  @Override
  public boolean isEmpty() {
    return (size == 0);
  }


  @Override
  public int size() {
    return size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyHashSet<?> myHashSet = (MyHashSet<?>) o;
    if (size != myHashSet.size) return false;
    for (Node<E> node : table) {
      while (node != null) {
        if (!myHashSet.contains(node.key)) {
          return false;
        }
        node = node.next;
      }
    }
    return true;
  }


  @NotNull
  @Override
  public Iterator<E> iterator() {
    return new HashSetIterator();
  }

  private class HashSetIterator implements Iterator<E> {
    private Node<E> currentNode;

    public HashSetIterator() {
      currentNode = null;
    }

    @Override
    public boolean hasNext() {
      return currentNode != null && currentNode.next != null;
    }

    @Override
    public E next() {
      if (!hasNext()) {
        currentNode = currentNode.next;
      }
      E ans = currentNode.key;
      currentNode = currentNode.next;
      return ans;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Node<E> node : table) {
      while (node != null) {
        sb.append(node.key);
        if (node.next != null) {
          sb.append(", ");
        }
        node = node.next;
      }
    }
    return sb.toString();
  }


  static class Node<T> {

    final int hash;
    final T key;
    Node<T> next;

    public Node(int hash, T key, Node<T> next) {
      this.hash = hash;
      this.key = key;
      this.next = next;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Node<?> node = (Node<?>) o;
      return hash == node.hash && key.equals(node.key) && next.equals(node.next);
    }

    @Override
    public int hashCode() {
      return Objects.hash(hash, key, next);
    }

    @Override
    public String toString() {
      return "Node{" +
              "hash=" + hash +
              ", key=" + key +
              ", next=" + next +
              '}';
    }
  }
}
