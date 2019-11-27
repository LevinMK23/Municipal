import java.util.Scanner;

public class TaskM {

    static int target;

    static void interestingBits(int n, int add, int pos, int [] a){
        if(n == 0) {
            boolean flag = true;
            for (int i = 0; i < pos - 1; i++){
                if (a[i+1] <= a[i] + 1){
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(target + "=");
                for (int i = 0; i < pos - 1; i++) {
                    System.out.print(a[i] + "+");
                }
                System.out.println(a[pos - 1]);
            }
        }
        if(add > n) return;
        a[pos] = add;
        interestingBits(n - add, add, pos + 1, a);
        interestingBits(n, add + 1, pos, a);
    }

    public static void main(String[] args) {
        target = new Scanner(System.in).nextInt();
        interestingBits(target, 1, 0, new int[target]);
    }
}
