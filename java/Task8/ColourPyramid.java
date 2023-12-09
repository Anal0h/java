package java.Task8;

final public class ColourPyramid extends Pyramid {
    private String colour;

    public ColourPyramid(double height, double area, String colour) {
        super(height, area);
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println("Объём пирамиды цвета " + colour + " с площадью основания " + getArea() + " и высотой " + getHeight() + ": " + (Pyramid.mathVolume(getHeight(), getArea())));
    }
}
