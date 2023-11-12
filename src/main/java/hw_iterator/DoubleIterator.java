package hw_iterator;

import java.util.Iterator;

public class DoubleIterator<T> implements Iterator<T> {
  private Iterator<T> first;
  private Iterator<T> second;

    public DoubleIterator(Iterator<T> first, Iterator<T> second) {
      this.first = first;
      this.second = second;
    }

    @Override
    public boolean hasNext() {
      return first.hasNext() || second.hasNext();
    }

    @Override
    public T next() {
      if (first.hasNext()) {
        return first.next();
      } else {
        return second.next();
      }
    }

}