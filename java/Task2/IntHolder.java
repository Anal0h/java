package java.Task2;

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
        IntHolder res = new IntHolder(a.elem + b.elem);
        return res;
    }

    public static IntHolder minus(IntHolder a, IntHolder b) {
        IntHolder res = new IntHolder(a.elem - b.elem);
        return res;
    }

    public static IntHolder multiply(IntHolder a, IntHolder b) {
        IntHolder res = new IntHolder(a.elem * b.elem);
        return res;
    }

    public static IntHolder devide(IntHolder a, IntHolder b) {
        if (b.elem != 0) {
            IntHolder res = new IntHolder(a.elem / b.elem);
            return res;
        } else {
            System.out.println("ERROR");
            return new IntHolder(0);
        }
    }

    public static IntHolder ostatok(IntHolder a, IntHolder b) {
        if (b.elem != 0) {
            IntHolder res = new IntHolder(a.elem % b.elem);
            return res;
        } else {
            System.out.println("ERROR");
            return new IntHolder(0);
        }
    }

    public static void swap(IntHolder a, IntHolder b) {
        int sw = a.elem;
        a.elem = b.elem;
        b.elem = sw;
    }

    public boolean equals(IntHolder b) {
        if (this.elem == b.elem) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.elem);
    }
}
