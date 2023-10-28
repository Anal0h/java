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
