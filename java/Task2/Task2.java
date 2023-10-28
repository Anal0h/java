package java.Task2;

public class Task2 {
    public static void main(String[] args) {
        String text = "aaa:(. spam.";
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        System.out.println(negativeTextAnalyzer.processText(text).type);
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"bad", "good"});
        System.out.println(spamAnalyzer.processText(text).type);
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(10);
        System.out.println(tooLongTextAnalyzer.processText(text).type);
        TextAnalyzer[] analyzers = {negativeTextAnalyzer, spamAnalyzer, tooLongTextAnalyzer};
        System.out.println(checkLabels(analyzers, text).type);
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label = new Label();
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != label)
                return analyzers[i].processText(text);
        return label;
    }
}
