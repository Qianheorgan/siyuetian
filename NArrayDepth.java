
import java.util.Scanner;
public class NArrayDepth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int depth = 0;
        int max = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == '['){
                depth++;
            }else if (s.charAt(i) == ']'){
                depth--;
            }
            if (depth > max)
                max = depth;
        }
        System.out.println(max);
    }
}