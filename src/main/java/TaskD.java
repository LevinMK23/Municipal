import java.util.Scanner;

public class TaskD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int [][] d = new int[n+1][n+1];
        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;
                if(len == 2) {
                    d[l][r] = 0;
                }
                else{
                    d[l][r] = Integer.MAX_VALUE;
                    for (int m = l + 1; m <= r - 1; m++) {
                        d[l][r] = Math.min(d[l][r], a[m] * (a[l] + a[r]) +
                                d[l][m] + d[m][r]);
                    }
                }
            }
        }
        //t = O(N^3) m = O(n^2)
        //N <= 100
        //ai <= 100
        //d[i][j] - минимальный штраф на отрезке от i до j
        System.out.println(d[0][n-1]);
    }
}
