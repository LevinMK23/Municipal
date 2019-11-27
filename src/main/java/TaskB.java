import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        int v = new Scanner(System.in).nextInt();
        boolean f = false;
        if(v < 0) {
            v = -v;
            f = true;
        }
        StringBuilder ans = new StringBuilder();
        while (v > 0) {
            if(v % 3 == 0) {
                ans.insert(0,0);
            }else if(v % 3 == 1){
                ans.insert(0,1);
            } else {
                v++;
                ans.insert(0,"$");
            }
            v /= 3;
        }
        if (f){
            for (int i = 0; i < ans.length(); i++) {
                if(ans.charAt(i) == '1'){
                    System.out.print('$');
                }
                else if(ans.charAt(i) == '$'){
                    System.out.print('1');
                }
                else {
                    System.out.print('0');
                }
            }
        }
        else {
            System.out.println(ans);
        }
    }
}
