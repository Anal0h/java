package java.Task3;

public class Task3 {
    public static void main(String[] args) {
        Pairs<Integer> pair = new Pairs<>(-3, 0);
        System.out.println(pair.max());
        System.out.println(pair.min());
    }
}

class Pairs<T extends Comparable<T>> {
    private T left;
    private T right;

    public Pairs(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public T min() {
        if (left.compareTo(right) > 0) {
            return right;
        } else {
            return left;
        }
    }

    public T max() {
        if (left.compareTo(right) > 0) {
            return left;
        } else {
            return right;
        }
    }
}
