import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskQ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, w;
        String [] line = reader.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        w = Integer.parseInt(line[1]);
        line = reader.readLine().split(" ");
        int [] arr  = new int[n];
        int pos = 0;
        for (String s : line){
            arr[pos++] = Integer.parseInt(s);
        }
        Arrays.sort(arr);
        for (int i = n-1; i >= 0 ; i--) {
            int first = arr[i];
            if(w - first >= arr[i-1]){
                System.out.println(first + arr[i-1]);
            }

        }
    }
}
