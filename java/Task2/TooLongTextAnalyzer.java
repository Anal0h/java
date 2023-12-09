package Task2;

public class TooLongTextAnalyzer implements TextAnalyzer {
  int maxlength;

  public TooLongTextAnalyzer(int maxlength) {
    this.maxlength = maxlength;
  }

  @Override
  public Label processText(String text) {
    if (text.length() > maxlength) {
      return Label.TOO_LONG;
    }
    return Label.OK;
  }
}
