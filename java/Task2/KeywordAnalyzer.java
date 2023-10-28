package java.Task2;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    public abstract String[] keywords();

    public abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = keywords();
        Label label = new Label();
        boolean flag = true;
        for (int i = 0; i < keywords().length; ++i) {
            if (text.contains(keywords[i])) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            return label;
        } else {
            return getLabel();
        }
    }
}
