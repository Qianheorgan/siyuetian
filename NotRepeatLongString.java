
import java.util.*;
public class NotRepeatLongString {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(Len(s));
    }
    public static int Len(String s){
        if(s.length()==0){
            return 0;
        }
        int max=0;
        int from=0;
        for(int i=0;i<s.length();i++){
            for(int j=from;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    from=j+1;
                }
            }
            if(i+1-from>max){
                max=i+1-from;
            }
        }
        return max;
    }
}