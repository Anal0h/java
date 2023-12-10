package src;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Task3 {
  public static void main(String[] args) {
    String word = "hello";
    String name = "Andrey";
    saySmth(word, name);
  }

  static void saySmth(String word, String name) {
    Function<String, Function<String, String>> greet = curry((a, b) -> a + ", " + b + "!");
    System.out.println(greet.apply(word).apply(name));
  }

  static <A, B, C> Function<A, Function<B, C>> curry(BiFunction<A, B, C> fn) {
    return a -> b -> fn.apply(a, b);
  }
}