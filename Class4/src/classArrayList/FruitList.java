package classArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> fruits = new ArrayList<>();
    System.out.println("Type a fruit now:");
    while (scanner.hasNextLine()) {
      String next = scanner.nextLine();
      if (next.equals("quit")) {
        System.out.println("Input over");
        break;
      }
      fruits.add(next);
      System.out.println("Type a fruit now:");
    }
    System.out.println("This is your fruit basket:");
    fruits.forEach(System.out::println);
  }
}
