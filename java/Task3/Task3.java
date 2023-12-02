package java.Task3;

public class Task3 {
    public static void main(String[] args) {
        Point one = new Point(2, 8);
        Point two = new Point();
        System.out.println(two.getX());
        System.out.println(one.getY());
        System.out.println(two.translate(1, 3));
        System.out.println(one.scale(0.25));

    }
}
