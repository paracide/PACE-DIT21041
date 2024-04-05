package class1;

public class View {

  public static void main(String[] args) {
    System.out.println("Hello, your name here");
    MyName name = new MyName();
    name.printName("Arthur");
    name.printReverseName("Arthur");
    name.printFormatName("ARTHUR");
    name.printFormatName("arthur", "nightFae");

    Today today = new Today();
    System.out.println(today.getNow());
  }
}
