import java.util.*;
public class Sequentialpatterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();
            int min = s.length() + 1;
            int start = -1;
            int end = -1;
            for(int i = 0; i < s.length(); i ++) {
                if(s.charAt(i) == t.charAt(0)) {
                    int k = 0;
                    int j = i;
                    while(j < s.length() && k < t.length()) {
                        if(s.charAt(j) == t.charAt(k)) {
                            k ++;
                        }
                        j ++;
                        if(j - i >= min) break;
                    }
                    if(k == t.length() && (j - i) < min) {
                        min = j - i;
                        start = i;
                        end = j - 1;
                    }
                }
            }
            System.out.println(start + " " + end);
        }
    }
}
