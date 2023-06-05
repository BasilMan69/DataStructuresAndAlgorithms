package bt04.ex2.b;
import java.util.Random;
import java.util.Arrays;

public class Something {
    public static int[] findBiggestThree(int num){
        Random r = new Random();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
        }
        int[] max = new int[3];
        max[0] = Integer.MIN_VALUE;
        max[1] = Integer.MIN_VALUE;
        max[2] = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max[2]){
                if(arr[i] > max[1]){
                    if(arr[i] > max[0]){
                        max[2] = max[1];
                        max[1] = max[0];
                        max[0] = arr[i];
                        continue;
                    }
                    max[2] = max[1];
                    max[1] = arr[i];
                    continue;
                }
                max[2] = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        final int N = 100;
        System.out.println(Arrays.toString(findBiggestThree(N)));
    }
}
