package java.Task7;

public class Car1 {
    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;

    public static class Builder {
        private String colour;
        private int fuel;
        private final int maxFuel;
        private final String model;
        private final Engine engine;
        private int mileage;

        public Builder(int maxFuel, String model, Engine engine) {
            this.maxFuel = maxFuel;
            this.model = model;
            this.engine = engine;
        }

        public Builder colour(String str) {
            this.colour = str;
            return this;
        }

        public Builder fuel(int n) {
            this.fuel = n;
            return this;
        }

        public Builder mileage(int n) {
            this.mileage = n;
            return this;
        }

        public Car1 build() {
            return new Car1(this);
        }
    }

    private Car1(Builder builder) {
        this.colour = builder.colour;
        this.fuel = builder.fuel;
        this.maxFuel = builder.maxFuel;
        this.model = builder.model;
        this.engine = builder.engine;
        this.mileage = builder.mileage;
    }

    public void info() {
        System.out.println("Цвет автомобиля: " + colour + ".");
        System.out.println("Осталось " + fuel + " литров топлива");
        System.out.println("Максимальная вместимость бака: " + maxFuel + " литров.");
        System.out.println("Модель авто: " + model + ".");
        if (engine.turn == true) {
            System.out.println("Двигатель включён.");
        } else {
            System.out.println("Двигатель выключен.");
        }
        System.out.println("Расход топлива - " + engine.fuelCons + " литров на 100 км.");
        System.out.println("Пробег составляет " + mileage + " км.");
    }

    public void refill() {
        fuel = maxFuel;
    }

    public void refill(int litr) {
        if (fuel + litr <= maxFuel) {
            fuel += litr;
        } else {
            fuel = maxFuel;
        }
    }

    public void stop() {
        engine.engineOff();
    }

    public void start() {
        engine.engineOn();
        while (engine.turn == true) {
            if (this.fuel >= this.engine.fuelCons) {
                this.fuel -= this.engine.fuelCons;
                this.mileage += 100;
            } else {
                System.out.println("Недостаточно топлива для продолжения движения.");
                this.engine.engineOff();
            }
        }
    }

    public void getMileage() {
        System.out.println("Автомобиль проехал " + this.mileage + " км.");
    }

    public static class Engine {
        private boolean turn;
        private int fuelCons;

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
