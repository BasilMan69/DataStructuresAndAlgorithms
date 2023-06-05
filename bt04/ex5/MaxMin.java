package bt04.ex5;
import java.util.Arrays;

public class MaxMin {
    public static int[] getMaxAndMin(int[] arr) {
        Arrays.sort(arr);
        return new int[] { arr[0], arr[arr.length - 1]};
    }
    public static void main(String[] args){
        int[] arr = {1 , 4 , 56, 64, 128, 1, 0, 3, -69};
        System.out.println(Arrays.toString(getMaxAndMin(arr)));
    }
}
