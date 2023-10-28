package java.Task8;

public class Task8 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Пустая строка");
            String m = null;
        }
    }
}
