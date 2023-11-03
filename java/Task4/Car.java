package Task4;

public class Car {
    private final String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;

    public Car(String colour, int fuel, int maxFuel, String model, int fuelCons, int mileage) {
        this.colour = colour;
        this.fuel = fuel;
        this.maxFuel = maxFuel;
        this.model = model;
        this.engine = new Engine(fuelCons);
        this.mileage = mileage;
    }

    public void info() {
        System.out.println("Цвет автомобиля: " + this.colour + ".");
        System.out.println("Осталось " + this.fuel + " литров топлива");
        System.out.println("Максимальная вместимость бака: " + this.maxFuel + " литров.");
        System.out.println("Модель авто: " + this.model + ".");
        if (this.engine.turn) {
            System.out.println("Двигатель включён.");
        } else {
            System.out.println("Двигатель выключен.");
        }
        System.out.println("Расход топлива - " + this.engine.fuelCons + " литров на 100 км.");
        System.out.println("Пробег составляет " + this.mileage + " км.");
    }

    public void refill() {
        this.fuel = this.maxFuel;
    }

    public void refill(int litr) {
        if (this.fuel + litr <= this.maxFuel) {
            this.fuel += litr;
        } else {
            this.fuel = this.maxFuel;
        }
    }

    public void stop() {
        this.engine.engineOff();
    }

    public void start() {
        this.engine.engineOn();
        while (this.engine.turn) {
            if (this.fuel >= this.engine.fuelCons) {
                this.fuel -= this.engine.fuelCons;
                this.mileage += 100;
            } else {
                System.out.println("Недостаточно топлива для продолжения движения.");
                this.engine.engineOff();
            }
        }
    }

    public int getMileage() {
        return this.mileage;
    }
    public void printMileage() {
        System.out.println("Автомобиль проехал " + getMileage() + " км.");
    }

    public static class Engine {
        private boolean turn;
        private final int fuelCons;

        public Engine(int fuelCons) {
            this.turn = false;
            this.fuelCons = fuelCons;
        }

        public void engineOn() {
            this.turn = true;
        }

        public void engineOff() {
            this.turn = false;
        }
    }
}
