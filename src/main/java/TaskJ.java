import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long [] a = new long[4];
        for (int i = 0; i < 4; i++) {
            a[i] = in.nextLong();
        }
        if(a[0]*a[1] < a[2] * a[3]){
            System.out.println("P");
        }else if(a[0]*a[1] > a[2] * a[3]){
            System.out.println("M");
        }else {
            System.out.println("E");
        }
    }
}
