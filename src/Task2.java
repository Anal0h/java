package src;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Task2 {
  public static void main(String[] args) {
    String string = "ilovejava";
    substringFiveSymbols(string);
  }

  static void substringFiveSymbols(String str) {
    Function<String, String> result = bind((a, b) -> b.substring(0, a), 5);
    System.out.println("result: " + result.apply(str));
  }

  static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
    return b -> fn.apply(a, b);
  }
}