package Task2;

public abstract class KeywordAnalyzer implements TextAnalyzer {
  public abstract String[] keywords();

  public abstract Label getLabel();

  public Label processText(String text) {
    String[] keywords = keywords();
    for (int i = 0; i < keywords().length; ++i) {
      if (text.contains(keywords[i])) {
        return getLabel();
      }
    }
    return Label.OK;
  }
}
