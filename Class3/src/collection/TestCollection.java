package collection;

import java.util.Arrays;

public class TestCollection {
  public static void main(String[] args) {
    // Array
    playWithInt(args);
    playWithString();

    // 2d Array
    String[][] fruits = {{"apple", "banana", "lemon", "orange"}, {"2.11", "3.33", "6.66", "10.10"}};
    for (int i = 0; i < fruits[0].length; i++) {
      System.out.println(fruits[0][i] + " - " + fruits[1][i]);
    }

    for (int i = 0; i < fruits.length; i++) {
      for (int j = 0; j < fruits[i].length; j++) {
        System.out.println(fruits[i][j]);
      }
    }
  }

  private static void playWithInt(String[] args) {
    Integer[] numbers = {512, 3, 1, 2, 4};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    System.out.println(Arrays.binarySearch(numbers, 512));
    System.out.println(numbers.length);

    numbers = addElements(numbers, 66);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(args));
  }

  private static void playWithString() {
    String[] fruits = {"apple", "banana", "lemon", "orange"};
    fruits = addElements(fruits, "cherry");
    Arrays.sort(fruits);
    System.out.println(Arrays.toString(fruits));
  }

  public static <T> T[] addElements(T[] arr, T newElement) {
    T[] result = Arrays.copyOf(arr, arr.length + 1);
    result[result.length - 1] = newElement;
    return result;
  }
}
