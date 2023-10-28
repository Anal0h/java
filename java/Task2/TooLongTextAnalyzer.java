package java.Task2;

public class TooLongTextAnalyzer implements TextAnalyzer {
    int maxlength;

    public TooLongTextAnalyzer(int maxlength) {
        this.maxlength = maxlength;
    }

    @Override
    public Label processText(String text) {
        Label labelOK = new Label();
        Label labelFALSE = new Label("TOO LONG");
        if (text.length() > maxlength) {
            return labelFALSE;
        } else {
            return labelOK;
        }
    }
}
