import java.util.*;
public class BinaryAdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int a = Integer.parseInt(str1,2);
        int b = Integer.parseInt(str2,2);
        System.out.println(Integer.toBinaryString(a+b));
    }
}