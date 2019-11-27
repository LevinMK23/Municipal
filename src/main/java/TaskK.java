import java.util.Arrays;
import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt(), n = in.nextInt();
        char [][] a = new char[h+1][w+1];
        for (int i = 0; i < h+1; i++) {
            for (int j = 0; j < w+1; j++) {
                a[i][j] = '.';
            }
        }
        char start = 'a';
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt(), y1 = in.nextInt(),
                    x2 = in.nextInt(), y2 = in.nextInt();
            for (int j = y1; j <= y2; j++) {
                a[x1][j] = start;
                a[x2][j] = start;
            }
            for (int j = x1; j <= x2; j++) {
                a[j][y1] = start;
                a[j][y2] = start;
            }
            start++;
        }
        for (int i = 1; i < h+1; i++) {
            for (int j = 1; j < w+1; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
