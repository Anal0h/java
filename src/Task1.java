package src;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Task1 {
  public static void main(String[] args) {
    Integer value = 7;
    multiplyByTwo(value);
  }

  static void multiplyByTwo(Integer n) {
    Function<Integer, Integer> result = bind((a, b) -> a * b, 2);
    System.out.println("result: " + result.apply(n));
  }

  static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
    return b -> fn.apply(a, b);
  }
}