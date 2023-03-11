public class Main {
    public static void main(String[] args) {

        NumArray na = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(na.sumRange(0,2));
        System.out.println(na.sumRange(2,5));
        System.out.println(na.sumRange(0,5));

    }
}