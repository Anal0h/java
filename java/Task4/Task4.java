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

        int[] arr = new int[]{5, 0, -9};
        PrintSign lambda = x -> {
            if (x > 0) {
                System.out.println("Положительное число");
            } else if (x < 0) {
                System.out.println("Отрицательное число");
            } else {
                System.out.println("Ноль");
            }
        };
        for (int i = 0; i < arr.length; ++i) {
            lambda.print(arr[i]);
        }
    }
}

interface PrintSign {
    void print(int x);
}

package Task4;

public class Task4 {
    public static void main(String[] args) {
        Car car = new Car("синий", 5, 100, "BMW", 18, 300);
        car.start();
        car.refill(500);
        car.info();
        car.start();
        car.printMileage();
    }
}
