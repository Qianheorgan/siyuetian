
import java.util.*;
public class LongPublicString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",");
        //将原字符串进行分割
         System.out.println(getPubLength(str));
    }
    //获取字符串A与字符串B的最大子串
public static int getPubLength(String[] str) {
        int max = 0;
        if(str.length > 2)
            return 0;
        for(int j = 0; j < str[0].length(); j++) {
            for(int i = str[0].length(); i > j; i--) {
                if(str[1].indexOf(str[0].substring(j, i)) != -1) {
                    int temp = str[0].substring(j, i).length();
                    if(max < temp) max = temp;
                }
            }
        }
        return max;
    }
}