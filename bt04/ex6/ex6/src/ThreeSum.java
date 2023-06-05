import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum {
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }

    public static int[][] findThreeSum(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int k = n-1;
            while (j < k){
                int x1 = a[i];
                int x2 = a[j];
                int x3 = a[k];
                int x = x1 + x2+ x3;
                if(x == 0){
                    res.add(x1);
                    res.add(x2);
                    res.add(x3);
                    j++;
                    k--;
                }else if(x < 0){
                    j++;
                }else{
                    k--;
                }
            }
//            for (int j = i+1; j < n; j++) {
//                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
//                if (k > j) System.out.println(a[i] + " " + a[j] + " " + a[k]);
//            }
        }
        Object[] objectResArr = res.toArray();
        int[][] intResArr = new int[objectResArr.length/3][3];
        for(int i=0; i < intResArr.length; i++){
            intResArr[i] = new int[]{(int)objectResArr[3*i], (int)objectResArr[3*i+1], (int)objectResArr[3*i+2]};
        }
        return intResArr;
    }

    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    }

}
