package java.Task9;

public class Task9 {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Элемента массива с таким индексом - нет");
        }
    }
}
