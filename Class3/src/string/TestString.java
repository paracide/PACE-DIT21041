package string;

import java.util.Arrays;

public class TestString {
  public static void main(String[] args) {
    String today = "today is friday";

    // replace
    System.out.println(today.replace("friday", "sunday"));

    // uppercase and split
    Arrays.stream(today.toUpperCase().split("\\s")).forEach(System.out::println);
  }
}
