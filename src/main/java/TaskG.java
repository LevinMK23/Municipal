import java.math.BigInteger;
import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        cash = new BigInteger[1001][1001];
        int n = new Scanner(System.in).nextInt();
        System.out.println(foo(n, 1));

    }

    static BigInteger [][] cash;

    static BigInteger foo(int n, int odd) {
        if(n == 0) return BigInteger.ONE;
        if(odd > n) return BigInteger.ZERO;
        if(n < 0) return BigInteger.ZERO;
        if(cash[n][odd] != null) {
            return cash[n][odd];
        }
        cash[n][odd] = foo(n - odd, odd).add(foo(n, odd + 2));
        return cash[n][odd];
    }

}
