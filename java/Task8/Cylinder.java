package java.Task8;

non-sealed class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        super(Cylinder.mathVolume(height, radius));
        this.height = height;
        this.radius = radius;
    }

    public static double mathVolume(double height, double radius) {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public void print() {
        System.out.println("Объём цилиндра радиусом " + radius + " и высотой " + height + ": " + (Cylinder.mathVolume(height, radius)));
    }
}