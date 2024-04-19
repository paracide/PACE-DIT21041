package string;

public class TestString {
  public static void main(String[] args) {
    String today = "today is friday";

    // replace
    System.out.println(today.replace("friday", "sunday"));

    // uppercase and split
    for (String v : today.toUpperCase().split(" ")) {
      System.out.println(v);
    }
  }
}
