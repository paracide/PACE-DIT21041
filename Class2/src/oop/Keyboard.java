package oop;

public class Keyboard {
  private int numberOfKeys;
  private String language;

  public Keyboard(int numberOfKeys, String language) {
    this.numberOfKeys = numberOfKeys;
    this.language = language;
  }

  public Keyboard(String language) {
    this.numberOfKeys = 84;
    this.language = language;
  }

  public int getNumberOfKeys() {
    return numberOfKeys;
  }

  public void setNumberOfKeys(int numberOfKeys) {
    this.numberOfKeys = numberOfKeys;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
