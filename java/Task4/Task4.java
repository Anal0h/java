package java.Task4;

public class Task4 {
    public static void main(String[] args) {
        Integer[] arr = {3, 9, -3, 0, 7};
        Pair<Integer> res = minMax(arr);
        System.out.println(res.getLeft() + " " + res.getRight());
    }

    public static <T extends Comparable<T>> Pair<T> minMax(T[] arr) {
        if (arr.length == 0) {
            return null;
        } else {
            T arrMin = arr[0];
            T arrMax = arr[0];
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i].compareTo(arrMin) < 0) {
                    arrMin = arr[i];
                }
                if (arr[i].compareTo(arrMax) > 0) {
                    arrMax = arr[i];
                }
            }
            return new Pair<>(arrMin, arrMax);
        }
    }
}

class Pair<T> {
    private T left;
    private T right;

    public Pair(T left, T right) {
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
}