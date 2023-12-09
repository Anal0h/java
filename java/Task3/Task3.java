package java.Task3;

public class Task3 {
    public static void main(String[] args) {
        Printable lambda;
        lambda = (x) -> System.out.printf("Число %s есть.", x);
        lambda.print(8);

    }
}

interface Printable {
    void print(int x);
}
        Point one = new Point(2, 8);
        Point two = new Point();
        System.out.println(two.getX());
        System.out.println(one.getY());
        System.out.println(two.translate(1, 3));
        System.out.println(one.scale(0.25));

    }
}

