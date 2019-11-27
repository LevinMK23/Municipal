import java.util.Scanner;

public class TaskW {

    static int k, ans = 0;

    public static void rec(int idx, int [] a, int n, boolean [] used) {
        if (idx == a.length) {
            long beauty = 0;
            for (int i = 0; i < a.length-1; i++){
                beauty += a[i] * a[i + 1];
            }
            if (beauty % k == 0) {
                ans++;
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (used[i])
                continue;
            a[idx] = i;
            used[i] = true;
            rec(idx + 1, a , n, used);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); k = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        rec(0, a, n, new boolean[n+1]);
        System.out.println(ans);
    }
}
