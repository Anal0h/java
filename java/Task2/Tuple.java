package Task2;

public class Tuple<E> {
  private E[] el;
  private int size;

  public Tuple(int capacity) {
    el = (E[]) new Object[capacity];
    size = 0;
  }

  public E get(int index) {
    return el[index];
  }

  public void add(E num) {
    ++size;
    for (int i = 0; i < size; ++i) {
      if (el[i] == null) {
        this.el[i] = num;
        break;
      }
    }
  }

  public void add(E num, int index) {
    if (this.el[index] == null) {
      ++size;
    }
    this.el[index] = num;
    ++size;

  }

  public void remove(int index) {
    if (this.el[index] != null) {
      this.el[index] = null;
      if (size == index) {
        for (int i = index; i >= 0; --i) {
          if (this.el[i] == null) {
            --size;
          } else {
            break;
          }
        }
      }
    }

  }

  public void remove(E num) {
    for (int i = 0; i < size; i++) {
      if (el[i] == num) {
        el[i] = null;
        break;
      }
    }
    for (int i = size - 1; i >= 0; --i) {
      if (this.el[i] == null) {
        --size;
      } else {
        break;
      }
    }
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E orElse(int index, E num) {
    if (index >= 0 && el[index] != null) {
      return el[index];
    } else {
      return num;
    }

  }
}
