package java.Task8;

public sealed class Shape permits Ball, Cylinder, Pyramid {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public void print() {
        System.out.println("Объём фигуры: " + volume);
    }
}