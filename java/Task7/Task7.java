
package java.Task7;

public class Task7 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
package Task7;

public class Task7 {
  public static void main(String[] args) {
    CarFirst.Engine engine = new CarFirst.Engine(10);
    CarFirst three = new CarFirst.Builder(240, "audi", engine)
            .colour("black")
            .fuel(0)
            .mileage(1000)
            .build();
    three.start();
    three.refill(500);
    three.info();
    three.start();
    three.getMileage();
  }
}
