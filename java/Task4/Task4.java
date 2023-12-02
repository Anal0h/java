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
