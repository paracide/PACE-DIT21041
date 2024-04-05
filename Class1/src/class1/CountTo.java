package class1;

public class CountTo {
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
