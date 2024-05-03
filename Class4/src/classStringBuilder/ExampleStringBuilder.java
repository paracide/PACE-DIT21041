package classStringBuilder;

import java.util.Scanner;

public class ExampleStringBuilder {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String result = scanner.nextLine();
      if ("exit".equalsIgnoreCase(result)) {
        break;
      }
      builder.append(result).append(" ");
    }
    System.out.println(builder);
  }
}
