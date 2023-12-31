
package src.main.java;

//import map.BaseMap;
//import map.MyHashMap;

import java.util.*;

public class Main {

  private static final List<String> BAD_VALUES = List.of("foo", "bar");

  public static List<Integer> findPrimes(int n) {
    HashSet<Integer> table = new HashSet<>();
    for (int i = 2; i <= n; ++i) {
      table.add(i);
    }
    for (int i = 2; i < n; ++i) {
      for (int j = i + 1; j <= n; ++j) {
        if (j % i == 0) {
          table.remove(j);
        }
      }
    }
    return new ArrayList<>(table);
  }

  public static void main(String[] args) {

    // create std map
    Map<String, Integer> hashMap = new HashMap<>();
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
    Map<String, Integer> treeMap = new TreeMap<>();
    Map<String, Integer> identityHashMap = new IdentityHashMap<>();
    Map<String, Integer> weakHashMap = new WeakHashMap<>();

    // simple multiMap
    Map<String, List<String>> multiMap = new HashMap<>();


    List<String> list = List.of("a", "a", "a", "b", "c");

    // task 1 with java.util.Map
    Map<String, Integer> res = new HashMap<>();
    for (String s : list) {
      if (res.containsKey(s)) {
        int old = res.get(s);
        res.put(s, old + 1);
      } else {
        res.put(s, 1);
      }
    }
    System.out.println("java.util.Map: " + res);

    // task 1 with MyHashMap
//    BaseMap<String, Integer> baseMap = new MyHashMap<>();
//    for (String s : list) {
//      if (baseMap.containsKey(s)) {
//        int old = baseMap.get(s);
//        baseMap.put(s, old + 1);
//      } else {
//        baseMap.put(s, 1);
//      }
//    }
//    System.out.println("MyHashMap: " + baseMap);
  }

  void add(String k, String v, Map<String, List<String>> multiMap) {
    List<String> list = multiMap.computeIfAbsent(k, k1 -> new ArrayList<>());
    list.add(v);
  }

  // ок
  void iterate1(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      String key = e.getKey();
      Integer value = e.getValue();
      System.out.println(key + " -> " + value);
    }
  }

  // не ок
  void iterate2(Map<String, Integer> map) {
    for (String key : map.keySet()) {
      Integer value = map.get(key);
      System.out.println(key + " -> " + value);
    }
  }


  void iterateVals(Map<String, Integer> map) {
    for (Integer value : map.values()) {
      System.out.println(value);
    }
  }

  void iterate3(Map<String, Integer> map) {
    map.forEach((k, v) -> System.out.println(k + " -> " + v));
  }

//  void trimVals(Map<String, String> map) {
//    for (var entry : map.entrySet()) {
//      entry.setValue(entry.getValue().trim());
//    }
//  }

  void trimAll(Map<String, String> map) {
    map.replaceAll((k, v) -> v.trim());
  }

  void removeSmth1(Map<String, String> map) {
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      if (entry.getValue().equals("foo") || entry.getValue().equals("bar")) {
        iterator.remove();
      }
    }
  }

  void removeSmth2(Map<String, String> map) {
    map.entrySet().removeIf(e ->
            e.getValue().equals("foo") ||
                    e.getValue().equals("bar"));
  }

  void removeSmth3(Map<String, String> map) {
    map.values().removeIf(val -> val.equals("foo"));
  }

  void removeSmth4(Map<String, String> map) {
    map.values().removeAll(BAD_VALUES);
  }
}

import classes.ArrayDeque;
import interfaces.Deque;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Comparator<String> comp = (s, t) -> s.charAt(1) - t.charAt(0);


    Deque<Integer> aq = new ArrayDeque<>();
    for (int i = 0; i < 50; i++) {
      aq.addLast(i);
    }
    aq.printDeque();


    for (int i = 0; i < 48; i++) {
      aq.removeFirst();
    }
    aq.printDeque();

    aq.addFirst(1);
    aq.addLast(2);
    aq.removeFirst();
    aq.printDeque();
  }

  static Iterable<String> remove(Iterable<String> iterable) {
    Iterator<String> iterator = iterable.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().isEmpty()) {
        iterator.remove();
      }
    }
    return iterable;
  }

  void printAll(Iterable<?> iterable) {
    Iterator<?> iterator = iterable.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  static Set<Integer> rangeSet(int from, int to) {
    return new AbstractSet<Integer>() {
      @Override
      public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
          int next = from;
          @Override
          public boolean hasNext() {
            return next != to;
          }

          @Override
          public Integer next() {
            if (next == to) {
              throw new NoSuchElementException();
            }
            return next++;
          }
        };
      }

      @Override
      public int size() {
        return to - from;
      }
    };
  }
}
