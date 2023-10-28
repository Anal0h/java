package java.Task4;

public class Task4 {
    public static void main(String[] args) {
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