import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-10, -100, -99, 0, 1, 99, 100, 10, 9, 5, 8};
        for(int[] arr: ThreeSum.findThreeSum(a)) {
            System.out.println(Arrays.toString(arr));
        }
    }
}