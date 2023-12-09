package hw_classes;

import interfaces.List;
import hw_iterator.MyIterator;

public class MyLinkedList<E> implements List<E>, Iterable<E> {

  public int size;
  public Node<E> begin;
  public Node<E> end;

  public MyLinkedList() {
    this.begin = null;
    this.end = null;
    this.size = 0;
  }

  public void add(E el) {
    ++size;
    Node<E> addNum = new Node<>(el, end, null);
    if (size == 1) {
      begin = addNum;
    } else {
      end.next = addNum;
    }
    end = addNum;
  }

  public void insertHead(E el) {
    ++size;
    Node<E> addNum = new Node<>(el, null, begin);
    if (size == 1) {
      end = addNum;
    } else {
      begin.last = addNum;
    }
    begin = addNum;
  }

  public void printList() {
    Node<E> thisNum = begin;
    while (thisNum.next != end) {
      System.out.print(thisNum.num + " ");
      thisNum = thisNum.next;
    }
    System.out.print(thisNum.num + "\n");
  }

  @Override
  public void add(int index, E el) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      insertHead(el);
    } else {
      if (index == size - 1) {
        add(el);
      } else {
        Node<E> thisNum = begin;
        for (int i = 0; i < index - 1; ++i) {
          thisNum = thisNum.next;
        }
        Node<E> addNum = new Node<>(el, thisNum, thisNum.next);
        thisNum.next = addNum;
        thisNum.next.last = addNum;
        ++size;
      }
    }
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node<E> thisNum = begin;
    for (int i = 0; i < index; ++i) {
      thisNum = thisNum.next;
    }
    return thisNum.num;
  }

  @Override
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    if (size == 1) {
      clear();
      return;
    }
    if (index == 0) {
      begin = begin.next;
      begin.last = null;
    } else {
      if (index == size - 1) {
        end = end.last;
        end.next = null;
      } else {
        Node<E> thisNum = begin;
        for (int i = 0; i < index; ++i) {
          thisNum = thisNum.next;
        }
        thisNum.next.last = thisNum.last;
        thisNum.last.next = thisNum.next;
      }
    }
    --size;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return (size == 0);
  }

  public E getFirst() {
    if (isEmpty()) {
      return null;
    }
    return begin.num;
  }

  public E getLast() {
    if (isEmpty()) {
      return null;
    }
    return end.num;
  }

  public void clear() {
    begin = null;
    end = null;
    size = 0;
  }


  @Override
  public MyIterator<E> iterator() {
    return new MyIterator<>(begin);
  }

  public static class Node<T> {
    public T num;
    public Node<T> last;
    public Node<T> next;

    public Node(T num, Node<T> last, Node<T> next) {
      this.num = num;
      this.last = last;
      this.next = next;
    }
  }
}