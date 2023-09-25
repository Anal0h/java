package java.Task7;

public class Task7 {
    public static void main(String[] args) {
        Car1.Engine engine = new Car1.Engine(10);
        Car1 three = new Car1.Builder(240, "audi", engine)
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
