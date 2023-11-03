package Task2;

public class Task2 {
    public static void main(String[] args) {
        IntHolder a = IntHolder.toHolder(88);
        IntHolder b = IntHolder.toHolder(0);
        System.out.println(IntHolder.plus(a, b));
        System.out.println(IntHolder.minus(a, b));
        System.out.println(IntHolder.multiply(a, b));
        System.out.println(IntHolder.devide(a, b));
        System.out.println(IntHolder.module(a, b));
        IntHolder.swap(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
    }
}
