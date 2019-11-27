import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), p = in.nextInt();
        String [] name = new String[n];
        LinkedList<LinkedList<String>> game = new LinkedList<>();
        LinkedList<LinkedList<String>> wait = new LinkedList<>();
        game.add(new LinkedList<>());
        game.add(new LinkedList<>());
        wait.add(new LinkedList<>());
        wait.add(new LinkedList<>());
        for (int i = 0; i < n; i++) {
            name[i] = in.next();
            if(game.get(i % 2).size() < p) {
                game.get(i % 2).add(name[i]);
            }
            else {
                wait.get(i % 2).add(name[i]);
            }
        }
        //System.out.println(game);
        //System.out.println(wait);
        while (m-- > 0){
            for (int i = 0; i < 2; i++) {
                wait.get(i % 2).add(game.get(i % 2).pollLast());
                game.get(i % 2).addFirst(wait.get(i % 2).pollFirst());
            }
            //System.out.println(game);
            //System.out.println(wait);
        }
        ArrayList<String> ans = new ArrayList<>(game.get(0));
        ans.addAll(game.get(1));
        Collections.sort(ans);
        for(String i : ans) System.out.print(i + " ");
    }
}
