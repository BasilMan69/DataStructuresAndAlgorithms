package bt04.ex4;
import java.math.BigInteger;

public class Power {
    public static BigInteger p(int x, int y) {
        BigInteger result = BigInteger.valueOf(1);
        while(y>0){
            BigInteger r = BigInteger.valueOf(x);
            int p = 1;
            while(y/p>1){
                r = r.multiply(r);
                p*=2;
            }
            y-=p;
            result = result.multiply(r);
        }
        return result;
    }

    public static double p(double x, int y) {
        double result = 1;
        while(y>0){
            double r = x;
            int p = 1;
            while(y/p>1){
                r*=r;
                p*=2;
            }
            y-=p;
            result*=r;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(p(2, 100));
        System.out.println(p(1.00001, 100000));
    }
}
