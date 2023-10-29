package java.Task1;

public class Task1 {
    public static void main(String[] args) {
        matrix<Integer> matrix = new classMatrix<Integer>(2, 2);
        matrix.add(5, 0, 1);
        matrix.add(10, 1, 0);
        matrix.add(9, 0, 0);
        System.out.println(matrix.get(1, 0));
        System.out.println(matrix.get(0, 1));
        matrix.remove(1, 1);
        System.out.println(matrix.get(1, 1));
    }
}
