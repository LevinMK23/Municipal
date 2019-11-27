import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    private static boolean [] used;

    private static boolean nextCombination(int[] a, int n, int m) {
        for (int i = m - 1; i >= 0; --i)
            if (a[i] < n - m + i + 1) {
                ++a[i];
                for (int j = i + 1; j < m; ++j)
                    a[j] = a[j - 1] + 1;
                return true;
            }
        return false;
    }


    public static void rec(int idx, int [] a, int n)
    {
        if (idx == a.length)
        {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++)
        {
            if (used[i])
                continue;
            a[idx] = i;
            used[i] = true;
            rec(idx + 1, a , n);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        boolean f = false;
        int [] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = in.nextInt();
        }
        int [] c = new int[]{1,2,3,4};
        while (nextCombination(c, 5, 4)){
            System.out.println(Arrays.toString(c));
        }
        if (nextCombination(a, n, k)){
            for(int i : a){
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println(-1);
        }
    }
}
