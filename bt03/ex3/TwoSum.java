package bt03.ex3;
import java.util.Random;

public class TwoSum {
    public static void main(String[] args){
        final int N = 20;
        Random r = new Random();
        int k = r.nextInt(0, N);
        int[] arr = new int[k];
        int index = 0;
        boolean duplicate = false;
        while(index < k){
            duplicate = false;
            int n = r.nextInt(-N, N);
            for(int i = 0; i < index; i++){
                if(arr[i] == n){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                continue;
            }
            arr[index] = n;
            index++;
        }
        int count = 0;
        for(int i = 0; i < k; i++){
            for(int j = i; j < k; j++){
                if(arr[i] + arr[j] == 0){
                    count++;
                }
            }
        }
        System.out.println("Number of pairs that satisfied the conditions: " + count);
    }
}
