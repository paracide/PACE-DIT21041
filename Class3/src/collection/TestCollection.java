package collection;

import java.util.Arrays;

public class TestCollection {
  public static void main(String[] args) {
    // Array
    // playWithInt(args);
    // playWithString();
    // playWith2dArray();

    Fruit orange = new Fruit("orange", 10, 12.2);
    Fruit cherry = new Fruit("cherry", 2, 11.11);
    Fruit watermelon = new Fruit("watermelon", 150, 112.2);
    Fruit lemon = new Fruit("lemon", 5, 22.22);
    Fruit[] fruits = {orange, cherry, watermelon, lemon, new Fruit("kiwi", 10, 10.1)};
    fruits = addElements(fruits, new Fruit("Grape", 1, 10));
    for (Fruit fruit : fruits) {
      System.out.println(fruit);
    }
  }

  private static void playWith2dArray() {
    // 2d Array
    String[][] fruits = {{"apple", "banana", "lemon", "orange"}, {"2.11", "3.33", "6.66", "10.10"}};
    for (int i = 0; i < fruits[0].length; i++) {
      System.out.println(fruits[0][i] + " - " + fruits[1][i]);
    }

    for (String[] fruit : fruits) {
      for (String s : fruit) {
        System.out.println(s);
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
