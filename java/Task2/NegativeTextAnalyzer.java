package Task2;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
  public String[] keywords = {":(", "=(", ":|"};

  @Override
  public String[] keywords() {
    return keywords;
  }

  @Override
  public Label getLabel() {
    return Label.NEGATIVE;
  }
}
