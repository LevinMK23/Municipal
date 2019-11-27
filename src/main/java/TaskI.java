import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeSet;

public class TaskI {

    static class Work implements Comparable<Work>{
        int day, cost, num;

        public Work(String [] data, int num) {
            this.day = Integer.parseInt(data[0]);
            this.cost = Integer.parseInt(data[1]);
            this.num = num;
        }

        @Override
        public String toString() {
            return "Work{" +
                    "day=" + day +
                    ", cost=" + cost +
                    '}';
        }

        @Override
        public int compareTo(Work o) {
            if(this.cost == o.cost){
                return this.day - o.day;
            }
            return -this.cost + o.cost;
        }
    }

    static void swap(Work[] a, int i, int j){
        Work tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static void sort(Work [] a, int l, int r){
        if (l < r){
            Work mid = a[(l+r)/2];
            int i = l, j = r;
            while (i <= j){
                while (a[i].compareTo(mid) < 0) i++;
                while (a[j].compareTo(mid) > 0) j--;
                if(i >= j) break;
                swap(a, i, j);
                i++;
                j--;
            }
            sort(a, l, j);
            sort(a, j+1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Work [] works = new Work[n];
        for (int i = 0; i < n; i++) {
            works[i] = new Work(reader.readLine().split(" "), i);
        }
        sort(works, 0, n-1);
        //System.out.println(Arrays.toString(works));
        TreeSet<Integer> days = new TreeSet<>();
        for (int i = 1; i < n + 1; i++) {
            days.add(i);
        }
        int [] ans = new int[n];
        long cost = 0;
        for (Work work : works){
            if (days.contains(work.day)){
                ans[work.num] = work.day;
                days.remove(work.day);
            } else if(days.lower(work.day) != null){
                int day = days.lower(work.day);
                ans[work.num] = day;
                days.remove(day);
            }
            else {
                cost += work.cost;
                int day = days.last();
                days.remove(day);
                ans[work.num] = day;
            }
        }
        System.out.println(cost);
        for(int i : ans) System.out.print(i + " ");
    }
}