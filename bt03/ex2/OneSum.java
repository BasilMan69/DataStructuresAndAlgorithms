package bt03.ex2;

import java.util.Random;
import java.util.Scanner;

public class OneSum{
    public static boolean hasZero(){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            Random r = new Random();
            int rand = r.nextInt(-100, 100);
            arr[i] = rand;
            if(arr[i] == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        if(hasZero()){
            System.out.println("the generated array contains zero");
        }else{
            System.out.println("the generated array does not contain 0");
        }
    }
}