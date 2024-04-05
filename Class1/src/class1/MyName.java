package class1;

public class MyName {
  private String name;

  public void printName(String name) {
    System.out.println("Hello, your name here: " + name);
  }

  public void printReverseName(String name) {
    System.out.println(new StringBuilder(name).reverse());
  }

  public void printFormatName(String name) {
    System.out.println(formatName(name));
  }

  public void printFormatName(String firstName, String lastName) {
    System.out.println(formatName(firstName) + "," + formatName(lastName));
  }

  private String formatName(String name) {
    return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
  }
}
