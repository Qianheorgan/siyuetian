import java.util.regex.Pattern;
import java.util.*;
public class MatchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String t = scanner.nextLine();

        if (Pattern.matches(p.replace("*",".*").replace("?","."),t)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}