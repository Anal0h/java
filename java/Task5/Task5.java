
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task5 {
  public static void main(String[] args) {
    List<Integer> arr = List.of(1, 0, 5, 15);
    List<String> ans = map(arr, n -> Integer.toBinaryString(n));
    System.out.println(ans);
  }

  static <R, T> List<R> map(List<T> list, Function<? super T, ? extends R> mapper) {
    List<R> result = new ArrayList<>();
    for (T item : list) {
      result.add(mapper.apply(item));
    }
    return result;
  }

package java.Task5;

public class Task5 {
  public static void main(String[] args) {
    String login = "log";
    String password = "password";
    String confirmPassword = "pasword";
    try {
      boolean flag = cheacker(login, password, confirmPassword);
      System.out.println(flag);
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e);
      System.out.println(false);
    }
    try {
      boolean flag = cheacker(login, password, password);
      System.out.println(flag);
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e);
      System.out.println(false);
    }
  }

  public static boolean cheacker(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

    final int MAX_LENGTH = 20;
    final int NUMBERS_BEGIN = 48;
    final int NUMBERS_END = 57;
    final int A_INDEX = 65;
    final int Z_INDEX = 90;
    final int a_INDEX = 97;
    final int z_INDEX = 122;
    final int UNDERSCORES = 95;
    if (login.length() >= MAX_LENGTH) {
      throw new WrongLoginException("Слишком длинный логин");
    }
    for (int i = 0; i < login.length(); ++i) {
      if (!((login.charAt(i) >= NUMBERS_BEGIN && login.charAt(i) <= NUMBERS_END) || (login.charAt(i) >= A_INDEX && login.charAt(i) <= Z_INDEX) || (login.charAt(i) >= a_INDEX && login.charAt(i) <= z_INDEX) || (login.charAt(i) == UNDERSCORES))) {
        throw new WrongLoginException();
      }
    }
    if (password.length() >= MAX_LENGTH) {
      throw new WrongPasswordException("Слишком длинный пароль");
    }
    for (int i = 0; i < login.length(); ++i) {
      if (!((password.charAt(i) >= NUMBERS_BEGIN && password.charAt(i) <= NUMBERS_END) || (password.charAt(i) >= A_INDEX && password.charAt(i) <= Z_INDEX) || (password.charAt(i) >= a_INDEX && password.charAt(i) <= z_INDEX) || (password.charAt(i) == UNDERSCORES))) {
        throw new WrongPasswordException();
      }
    }
    if (!password.equals(confirmPassword)) {
      throw new WrongPasswordException("Пароли не совпадают");
    }
    return true;
  }
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2, 10, "Антон", "Британец", Pet.price.EXPENSIVE);
        Dog dog = new Dog("Дружок", 10, 3, "Катя", "корги", Pet.price.CHEAP);
        Parrot parrot = new Parrot("Джек", 1, 1, "Сева", "Австралия", true);
        cat.walk();
        dog.walk("Саша");
        parrot.fly();
        Pet[] house = new Pet[] {cat, dog, parrot};
        for (int i = 0; i <= 2; i++) {
            if (house[i] instanceof Cat) {
                System.out.println(cat.say());
            }
            if (house[i] instanceof Dog) {
                System.out.println(dog.say());
            }
            if (house[i] instanceof Parrot) {
                System.out.println(parrot.say());
            }
        }
    }

}
