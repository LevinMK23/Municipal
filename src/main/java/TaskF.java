import java.util.Scanner;

public class TaskF {

    static long [] p = new long[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
    static long answer, cntForAnswer;
    static long N;

    public static void findMax(int index, int lastA, long value, long cntForValue)
    {
        if (cntForValue > cntForAnswer || (cntForValue == cntForAnswer && value < answer)) {
            answer = value;
            cntForAnswer = cntForValue;
        }
        if(index == 15) return;
        for(int a = 1; a <= lastA; a++) {
            long temp = value * p[index];
            // проверка на переполнение
            if(temp / p[index] != value) return;
            // если получили число больше N
            if(temp > N) break;
            value = temp;
            findMax(index + 1, a, value, cntForValue * (a + 1));
        }
    }

    public static int sum(long val){
        int s = 0;
        for (int i = 1; i < val; i++) {
            if(val % i == 0) s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        //N = new Scanner(System.in).nextInt();
        for (N = 3; N < 125; N++) {
            findMax(0, 64, 1, 1);
            System.out.print("N = " + N + " " + answer + " " + cntForAnswer);
            System.out.println(" " + sum(answer));
        }
    }
}
