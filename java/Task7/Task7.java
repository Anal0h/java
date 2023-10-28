package java.Task7;

public class Task7 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
