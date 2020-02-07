import java.util.HashSet;
import java.util.Scanner;

public class StringLengthProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String sub = str.substring(1,str.length()-1);
        String[] strs  = sub.split(",");
        for (int i=0;i<strs.length;i++){
            if (strs[i].length() == 0)
                continue;
            strs[i] = strs[i].substring(1,strs[i].length()-1);
        }
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<strs.length;i++){
            for (int j=i+1;j<strs.length;j++){
                set.clear();
                int k;
                for (k=0;k<strs[i].length();k++){
                    set.add(strs[i].charAt(k));
                }
                for (k=0;k<strs[j].length();k++){
                    if (set.contains(strs[j].charAt(k)))
                        break;
                }
                if (k == strs[j].length()){
                    int length = strs[i].length()*strs[j].length();
                    if (length > max)
                        max = length;
                }
            }
        }
        System.out.println(max);
    }
}