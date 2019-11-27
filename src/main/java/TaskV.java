import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.Math.abs;

public class TaskV {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)('a' + (min(abs(i - j), abs(i - (n-j-1))))%26));
            }
            System.out.println();
        }
    }
}
