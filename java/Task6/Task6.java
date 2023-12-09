
public class Task6 {
  public static void main(String[] args) {
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = {1, 2};
      //abc[3] = 9;
      printSum(b, null);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (NullPointerException ex) {
      System.out.println("В поиске суммы одно из слагаемых равно не определено!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }
  }

  public static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
  }

package java.Task6;

public class Task6 {
    public static void main(String[] args) {
        Contact man = new Contact("Гоша", "asdfghj@gmail.com");
        man.sayHello();
        Contact woman = new Contact("", "popasdfg@com");
        woman.sayHello();
    }
}
