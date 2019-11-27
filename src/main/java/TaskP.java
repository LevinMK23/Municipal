import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            String s = in.next();
            if (s.startsWith("Oo")){
                s = s.replaceFirst("Oo", "Ou");
                if (s.startsWith("Ou")){
                    char [] a = s.toCharArray();
                    int pos = 2;
                    if(a[pos] == 'o'){
                        while (pos < a.length && a[pos] == 'o') pos++;
                    }
                    for (int i = pos; i < a.length-1; i++) {
                        if (a[i] == 'o' && a[i + 1] == 'o'){
                            a[i+1] = 'u';
                            if (i + 1 == a.length - 1){
                                break;
                            }
                            while (i + 2 < a.length && a[i + 2] == 'o'){
                                i++;
                            }
                        }
                    }
                    s = String.copyValueOf(a);
                }
            } else {
                char [] a = s.toCharArray();
                for (int i = 0; i < a.length-1; i++) {
                    if (a[i] == 'o' && a[i + 1] == 'o'){
                        a[i+1] = 'u';
                        if (i + 1 == a.length - 1){
                            break;
                        }
                        while (i + 2 < a.length && a[i + 2] == 'o'){
                            i++;
                        }
                    }
                }
                s = String.copyValueOf(a);
                //s = s.replaceAll("o{2,}", "ou");
            }
            if (s.charAt(0) == 's'){
                s = "s" + s.substring(1).replaceAll("s", "th")
                        .replaceAll("thh", "sh");
            } else if(s.charAt(0) == 'S'){
                s = "S" + s.substring(1).replaceAll("s", "th")
                        .replaceAll("thh", "sh");
            } else {
                s = s.replaceAll("s", "th")
                        .replaceAll("thh", "sh");
            }
            if (s.charAt(0) == 'e'){
                s = s.replaceFirst("e", "ae");
            } else if (s.charAt(0) == 'E'){
                s = s.replaceFirst("E", "Ae");
            }
            System.out.println(s);
        }
    }
}
