import java.util.Arrays;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0] * a[1] + a[2] * a[3]);
    }
}
