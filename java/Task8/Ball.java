package java.Task8;

final class Ball extends Shape {
    private double radius;

    public Ball(double radius) {
        super(Ball.mathVolume(radius));
        this.radius = radius;
    }

    public static double mathVolume(double radius) {
        return (4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public void print() {
        System.out.println("Объём шара радиусом " + radius + ": " + (Ball.mathVolume(radius)));
    }
}
