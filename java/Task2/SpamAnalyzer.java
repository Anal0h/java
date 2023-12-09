package Task2;

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
    return Label.SPAM;
  }
}
