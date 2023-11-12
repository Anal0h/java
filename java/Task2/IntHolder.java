package Task2;

import java.util.Objects;

public class IntHolder {
  private int elem;

  public IntHolder(int elem) {
    this.elem = elem;
  }

  static IntHolder toHolder(int elem) {
    return new IntHolder(elem);
  }

  @Override
  public String toString() {
    return String.valueOf(elem);
  }

  public void plus(IntHolder a) {
    this.elem = a.elem + this.elem;
  }

  public void minus(IntHolder a) {
    this.elem = this.elem - a.elem;
  }

  public void multiply(IntHolder a) {
    this.elem = this.elem * a.elem;
  }

  public void devide(IntHolder a) throws ArithmeticException {
    if (a.elem != 0) {
      this.elem = this.elem / a.elem;
    } else {
      throw new ArithmeticException("Деление на ноль");
    }
  }

  public void module(IntHolder a) throws ArithmeticException {
    if (a.elem != 0) {
      this.elem = this.elem % a.elem;
    } else {
      throw new ArithmeticException("Остаток от деления на ноль");
    }
  }

  public static void swap(IntHolder a, IntHolder b) {
    int sw = a.elem;
    a.elem = b.elem;
    b.elem = sw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntHolder intHolder = (IntHolder) o;
    return (elem == intHolder.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.elem);
  }
}
