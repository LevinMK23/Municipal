import java.util.*;

import static java.lang.Integer.max;
import static java.lang.Math.abs;


public class TaskL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());list.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            int pos = in.nextInt(), val = in.nextInt();
            list.get(pos).add(val);
        }
        list.get(0).sort(Comparator.comparing(o -> -o));
        list.get(1).sort(Comparator.comparing(o -> -o));
        //System.out.println(list);
        int ma = 0;
        for (int i = 0; i < list.get(0).size()-1; i++) {
            ma = max(ma, list.get(0).get(i)-list.get(0).get(i+1));
        }
        if (!list.get(0).isEmpty() && !list.get(1).isEmpty()) {
            ma = max(ma, abs(list.get(0).get(list.get(0).size() - 1)
                    - list.get(1).get(0)));
        }
        for (int i = 0; i < list.get(1).size()-1; i++) {
            ma = max(ma, list.get(1).get(i)-list.get(1).get(i+1));
        }
        System.out.println(ma);
    }
}
