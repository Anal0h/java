package hw_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import hw_classes.MyLinkedList.Node;

public class MyIterator<T> implements Iterator<T> {
  Node<T> thisNode;

  public MyIterator(Node<T> begin) {
    this.thisNode = begin;
  }

  @Override
  public boolean hasNext() {
    return (thisNode != null && thisNode.next != null);
  }

  @Override
  public T next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    T nextNum = thisNode.num;
    thisNode = thisNode.next;
    return nextNum;
  }

  public boolean hasPrevious() {
    return (thisNode != null && thisNode.last != null);
  }

  public T previous() {
    if (!hasPrevious()) {
      throw new NoSuchElementException();
    }
    T nextNum = thisNode.num;
    thisNode = thisNode.last;
    return nextNum;
  }
}
