package java.Task2;

public class Task2 {
    public static void main(String[] args) {
        Tuple<Integer> tuple = new Tuple<Integer>(4);
        tuple.add(1);
        tuple.add(3, 2);
        System.out.println(tuple.get(0));
        System.out.println(tuple.get(1));
        System.out.println(tuple.get(2));
        tuple.remove(0);
        System.out.println(tuple.get(0));
        tuple.remove(Integer.valueOf(3));
        System.out.println(tuple.get(2));
        System.out.println(tuple.isEmpty());
        tuple.add(1);
        tuple.add(2, 2);
        System.out.println(tuple.isEmpty());
        System.out.println(tuple.orElse(2, 0));
        System.out.println(tuple.orElse(1, 0));
    }
}
