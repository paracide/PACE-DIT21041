package collection;

import java.util.Arrays;

public class TestCollection {
  public static void main(String[] args) {
    // Array
    int[] numbers = {512, 3, 1, 2, 4};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    System.out.println(Arrays.binarySearch(numbers, 512));
    System.out.println(numbers.length);

    numbers = addElements(numbers, 66);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(args));

    String[] fruits = {"apple", "banana", "lemon", "orange"};
    fruits = addElements(fruits, "cherry");
    System.out.println(Arrays.toString(fruits));
  }

  public static int[] addElements(int[] arr, int addNum) {
    int[] result = Arrays.copyOf(arr, arr.length + 1);
    result[result.length - 1] = addNum;
    return result;
  }

  public static String[] addElements(String[] fruits, String fruit) {
    String[] result = Arrays.copyOf(fruits, fruits.length + 1);
    result[result.length - 1] = fruit;
    return result;
  }
}
