package oop;

public class Software {
  private String name;
  private double price;
  private String language;

  public Software(String name, double price, String language) {
    this.name = name;
    this.price = price;
    this.language = language;
  }

  public boolean runInstallation() {
    return true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
