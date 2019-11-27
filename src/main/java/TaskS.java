import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class TaskS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(),
                a = in.nextInt(), b = in.nextInt();
        int [] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        System.out.println(ans(x, k, n - 1, a, b));
    }

    static int [][] d  = new int[201][201];

    private static int ans(int[] v, int k, int l, int a, int b) {
        if (k < 0 || l < 0)
            return -2000000000;
        if (k == 0 && l == 0)
            return 2000000000;
        if (k == 0)
            return -2000000000;
        if (d[k][l] != 0)
            return d[k][l];
        int res = 2000000000;
        int mx = -1;
        for (int i = a-1; i < b && l - i >= 0; i++) {
            mx = max(mx, v[l] - v[l-i]);
            res = min(res, max(ans(v, k - 1, l - i - 1, a, b), mx));
        }
        return d[k][l] = res;
    }
}
