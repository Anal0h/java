package java.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 0, 5, 15);
        List<String> ans = map(arr, n -> Integer.toBinaryString(n));
        System.out.println(ans);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            R elem = function.apply(element);
            result.add(elem);
        }
        return result;
    }
}
