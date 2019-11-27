import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskU {

    static class Div implements Comparable<Div>{

        private int a, b;

        private static int gcd(int a, int b){
            return b == 0 ? a : gcd(b, a % b);
        }

        public Div(int a, int b) {
            //System.out.println(gcd(a, b));
            this.a = a / gcd(a, b);
            this.b = b / gcd(a, b);
        }

        @Override
        public String toString() {
            return a + "/" + b;
        }

        public int compareTo(Div other) {
            return this.a * other.b - this.b * other.a;
        }
    }

    static int p, q;

    private static void fareiSequence(int n, int x, int y, int z, int t) {
        int a = x + z, b = y + t;
        if (b <= n) {
            fareiSequence(n, x, y, a, b);
            if(a * p > b && a * q < b) {
                System.out.printf("%d/%d\n\r", a, b);
            }
            fareiSequence(n, a, b, z, t);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        p = in.nextInt();
        q = in.nextInt();
        fareiSequence(n - 1, 0,1, 1, 1);
    }
}
