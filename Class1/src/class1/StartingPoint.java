package class1;

public class StartingPoint {
    public static void main(String[] args) {
        CountTo countTo = new CountTo();
        countTo.count(1, 2);
        //1-01
        countTo.count(2, 1);
        //1-20
        countTo.count(1, 3);
        //20-1
        countTo.count(3, 1);
        //1 - only odd
        countTo.countUpOdd(1, 100);
    }
}
