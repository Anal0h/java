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
}
