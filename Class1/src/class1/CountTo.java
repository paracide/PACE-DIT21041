package class1;

public class CountTo {
  public static void main(String[] args) {
    CountTo countTo = new CountTo();
    countTo.count(1, 2);
    // 1-01
    countTo.count(2, 1);
    // 1-20
    countTo.count(1, 3);
    // 20-1
    countTo.count(3, 1);
    // 1 - only odd
    countTo.countUpOdd(1, 100);
  }

  public void count(int start, int end) {
    if (start < end) {
      for (int i = start; i <= end; i++) {
        System.out.println(i);
      }
    } else {
      for (int i = start; i >= end; i--) {
        System.out.println(i);
      }
    }
  }

  public void countUpOdd(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}
