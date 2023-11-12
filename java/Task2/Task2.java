package Task2;

public class Task2 {
  public static void main(String[] args) {
    IntHolder a = IntHolder.toHolder(88);
    IntHolder b = IntHolder.toHolder(2);
    a.plus(b);
    System.out.println(a);
    a.minus(b);
    System.out.println(a);
    b.multiply(b);
    System.out.println(b);
    a.devide(b);
    System.out.println(a);
    a.module(b);
    System.out.println(a);
    IntHolder.swap(a, b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.equals(b));
    System.out.println(b.equals("4"));
    System.out.println(a.hashCode());
  }
}
