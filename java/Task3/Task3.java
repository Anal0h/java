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
        Printable lambda;
        lambda = (x) -> System.out.printf("Число %s есть.", x);
        lambda.print(8);

    }
}

interface Printable {
    void print(int x);
}
        Point one = new Point(2, 8);
        Point two = new Point();
        System.out.println(two.getX());
        System.out.println(one.getY());
        System.out.println(two.translate(1, 3));
        System.out.println(one.scale(0.25));

    }
}

