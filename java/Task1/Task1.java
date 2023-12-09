package java.Task1;

public class Task1 {

    public static void main(String[] args) {
        matrix<Integer> matrix = new classMatrix<Integer>(2, 2);
        matrix.add(5, 0, 1);
        matrix.add(10, 1, 0);
        matrix.add(9, 0, 0);
        System.out.println(matrix.get(1, 0));
        System.out.println(matrix.get(0, 1));
        matrix.remove(1, 1);
        System.out.println(matrix.get(1, 1));
    }
}

  public static void main(String[] args) {
    IntSequence first = IntSequence.of(1, 2, 3, 4, 5);
    while (first.hasNext()) {
      System.out.println(first.next());
    }
    //System.out.println(first.next());
    IntSequence second = IntSequence.constant(7);
    for (int i = 0; i < 5; ++i) {
      System.out.println(second.next());
    }
  }
}

interface IntSequence {

  boolean hasNext();

  int next();

  static IntSequence of(int... n) {
    IntSequence intSequence = new IntSequence() {
      int index = 0;

      @Override
      public boolean hasNext() {
        return (index < n.length)
      }

      @Override
      public int next() {
        if (index < n.length) {
          return n[index++];
        } else {
          throw new ArrayIndexOutOfBoundsException();
        }
      }
    };
    return intSequence;
  }

  static IntSequence constant(int n) {
    IntSequence intSequence = new IntSequence() {
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public int next() {
        return n;
      }
    };
    return intSequence;
  }
}

package Task1;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(equals("AbC", "aBC"));
    System.out.println(replace("aaaasas", "s", "hh"));
    System.out.println(format("Иванов", 5, "java"));
    System.out.println(isPalindrome("шалаш"));
    System.out.println("");
  }

  static boolean equals(String s, String t) {
    String a = s.toLowerCase();
    String b = t.toLowerCase();
    return a.equals(b);
  }

  static String replace(String str, String oldStr, String newStr) {
    return str.replace(oldStr, newStr);
  }

  static String format(String surname, int mark, String subject) {
    String text = String.format("Студент %s получил %s по %s.", surname, mark, subject);
    return text;
  }

  static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}

