
package java.Task2;

public class Task2 {
    public static void main(String[] args) {
        Tuple<Integer> tuple = new Tuple<Integer>(4);
        tuple.add(1);
        tuple.add(3, 2);
        System.out.println(tuple.get(0));
        System.out.println(tuple.get(1));
        System.out.println(tuple.get(2));
        tuple.remove(0);
        System.out.println(tuple.get(0));
        tuple.remove(Integer.valueOf(3));
        System.out.println(tuple.get(2));
        System.out.println(tuple.isEmpty());
        tuple.add(1);
        tuple.add(2, 2);
        System.out.println(tuple.isEmpty());
        System.out.println(tuple.orElse(2, 0));
        System.out.println(tuple.orElse(1, 0));
    }

package Task2;

public class Task2 {
  public static void main(String[] args) {

    String text = "aaa:(. spam.";
    NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
    System.out.println(negativeTextAnalyzer.processText(text));
    SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"bad", "good"});
    System.out.println(spamAnalyzer.processText(text));
    TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
    System.out.println(tooLongTextAnalyzer.processText(text));
    TextAnalyzer[] analyzers = {negativeTextAnalyzer, spamAnalyzer, tooLongTextAnalyzer};
    System.out.println(checkLabels(analyzers, text));
  }

  public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (int i = 0; i < analyzers.length; i++)
      if (analyzers[i].processText(text) != Label.OK)
        return analyzers[i].processText(text);
    return Label.OK;

    IntHolder a = IntHolder.toHolder(88);
    IntHolder b = IntHolder.toHolder(2);
    a.plus(b);
    System.out.println(a);
    a.minus(b);
    System.out.println(a);
    b.multiply(b);
    System.out.println(b);
    a.devide(b);
    System.out.println(a);
    a.module(b);
    System.out.println(a);
    IntHolder.swap(a, b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.equals(b));
    System.out.println(b.equals("4"));
    System.out.println(a.hashCode());
  }
}
