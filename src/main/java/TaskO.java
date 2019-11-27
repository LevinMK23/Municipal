import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        k--; n--;
        System.out.println((k + n) * b + " " + n * a);
    }
}
