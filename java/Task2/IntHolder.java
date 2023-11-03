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

    public static IntHolder plus(IntHolder a, IntHolder b) {
        return new IntHolder(a.elem + b.elem);
    }

    public static IntHolder minus(IntHolder a, IntHolder b) {
        return new IntHolder(a.elem - b.elem);
    }

    public static IntHolder multiply(IntHolder a, IntHolder b) {
        return new IntHolder(a.elem * b.elem);
    }

    public static IntHolder devide(IntHolder a, IntHolder b) throws ArithmeticException {
        if (b.elem != 0) {
            return new IntHolder(a.elem / b.elem);
        } else {
            throw new ArithmeticException("Деление на ноль");
        }
    }

    public static IntHolder module(IntHolder a, IntHolder b) throws ArithmeticException {
        if (b.elem != 0) {
            return new IntHolder(a.elem % b.elem);
        } else {
            throw new ArithmeticException("Остаток от деления на ноль");
        }
    }

    public static void swap(IntHolder a, IntHolder b) {
        int sw = a.elem;
        a.elem = b.elem;
        b.elem = sw;
    }

    public boolean equals(IntHolder b) {
        return this.elem == b.elem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.elem);
    }
}
