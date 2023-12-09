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
