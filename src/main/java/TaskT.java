import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();
        if (k == 0){
            System.out.println(0);
            return;
        }
        while (k % 10 == 0) k /= 10;
        int sum = 0;
        while (k > 0){
            if (k % 10 == 0) sum++;
            k /= 10;
        }
        System.out.println(sum);
    }
}
