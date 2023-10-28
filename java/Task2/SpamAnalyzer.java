package java.Task2;

public class SpamAnalyzer extends KeywordAnalyzer {
    public String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String[] keywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        Label label = new Label("SPAM");
        return label;
    }
}
