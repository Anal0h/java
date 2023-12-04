package hw_classes;

import interfaces.Deque;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MyDeque<E> implements Deque<E> {
  public Stack<E> BaseStack = new Stack<>();
  public Stack<E> ExtraStack = new Stack<>();

  @Override
  public void addFirst(E e) {
    while (!BaseStack.empty()) {
      ExtraStack.push(BaseStack.pop());
    }
    ExtraStack.push(e);
    while (!ExtraStack.empty()) {
      BaseStack.push(ExtraStack.pop());
    }
  }

  @Override
  public void addLast(E e) {
    BaseStack.push(e);
  }

  @Override
  public E removeFirst() {
    if (BaseStack.empty()) {
      throw new NoSuchElementException();
    }
    while (!BaseStack.empty()) {
      ExtraStack.push(BaseStack.pop());
    }
    E remove = ExtraStack.pop();
    while (!ExtraStack.empty()) {
      BaseStack.push(ExtraStack.pop());
    }
    return remove;
  }

  @Override
  public E removeLast() {
    if (BaseStack.empty()) {
      throw new NoSuchElementException();
    }
    return BaseStack.pop();
  }

  @Override
  public E peekFirst() {
    if (BaseStack.empty()) {
      return null;
    }
    while (!BaseStack.empty()) {
      ExtraStack.push(BaseStack.pop());
    }
    E peek = ExtraStack.peek();
    while (!ExtraStack.empty()) {
      BaseStack.push(ExtraStack.pop());
    }
    return peek;
  }

  @Override
  public E peekLast() {
    if (BaseStack.empty()) {
      return null;
    }
    return BaseStack.peek();
  }

  @Override
  public boolean isEmpty() {
    return BaseStack.empty();
  }

  @Override
  public int size() {
    return BaseStack.size();
  }

  @Override
  public void printDeque() {
    while (!BaseStack.empty()) {
      ExtraStack.push(BaseStack.pop());
    }
    while (!ExtraStack.empty()) {
      System.out.println(ExtraStack.pop());
    }
  }
}
