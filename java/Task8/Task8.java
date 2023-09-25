package java.Task8;

public class Task8 {
    public static void main(String[] args) {
        Shape shape = new Shape(51.12);
        shape.print();
        Ball ball = new Ball(10);
        ball.print();
        Cylinder cylinder = new Cylinder(2, 3.9);
        cylinder.print();
        Pyramid pyramid = new Pyramid(56, 3.1);
        pyramid.print();
        ColourPyramid colourPyramid = new ColourPyramid(56, 3.2, "белый");
        colourPyramid.print();
    }
}
