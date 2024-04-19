package collection;

import java.util.Arrays;

public class TestCollection {
  public static void main(String[] args) {
    // Array
    Integer[] numbers = {512, 3, 1, 2, 4};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    System.out.println(Arrays.binarySearch(numbers, 512));
    System.out.println(numbers.length);

    numbers = addElements(numbers, 66);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(args));

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
