package java.Task8;

sealed class Pyramid extends Shape permits ColourPyramid {
    private double height;
    private double area;

    public Pyramid(double height, double area) {
        super(Pyramid.mathVolume(height, area));
        this.height = height;
        this.area = area;
    }

    public static double mathVolume(double height, double area) {
        return (area * height / 3);
    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void print() {
        System.out.println("Объём пирамиды с площадью основания " + area + " и высотой " + height + ": " + (Pyramid.mathVolume(height, area)));
    }
}
