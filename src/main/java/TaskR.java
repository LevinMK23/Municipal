import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Math.abs;
public class TaskR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int f = 0, s = 0, pos = 0;
        int [] ans = new int[k];
        for (int i = 1; i < k + 1; i++) {
            int tmp = in.nextInt();
            if(tmp == 1) f++;
            else s++;
            if (max(f,s) > min(f,s) + k - i){
                if (pos + 1 < k - 1) pos++;
                System.out.println(pos);
                for (int j = 0; j < k; j++) {
                    if (j < pos) System.out.print("0 ");
                    else System.out.print("1 ");
                }
                return;
            }
            else{
                if (k - i < n - min(f,s)){
                    if (pos + 1 < k - 1) pos++;
                    System.out.println(pos);
                    for (int j = 0; j < k; j++) {
                        if (j < pos) System.out.print("0 ");
                        else System.out.print("1 ");
                    }
                    return;
                }
                else {
                    pos++;
                    //System.out.print("0 ");
                }
            }

        }
    }
}
