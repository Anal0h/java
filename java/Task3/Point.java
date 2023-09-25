package java.Task3;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(x + " " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double x) {
        return new Point(this.x * x, this.y * x);
    }
}
