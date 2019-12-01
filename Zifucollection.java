import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//字符集合
public class Zifucollection {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            String a=in.next();
            char[] b = a.toCharArray();
            StringBuffer c= new StringBuffer();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < b.length; i++) {
                if (set.add(b[i])) {
                    c.append(b[i]);
                }
            }
            System.out.println(c.toString());
        }
    }
}


