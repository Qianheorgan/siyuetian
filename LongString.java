import java.util.Arrays;
import java.util.Scanner;

public class LongString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String a=get(s);
        System.out.println(a);
    }
    public  static  String get(String s){
        int len=s.length();
        String result="";
        int max=0;
        if(len<=1){
            return "";
        }
        String [] b=new String [len];
        for(int i=0;i<len;i++){
            b[i]=s.substring(i,len);
        }
        Arrays.sort(b);
        for(int i=0;i<len-1;i++){
            int tmp=get1(b[i],b[i+1]);
            if(tmp>max){
                max=tmp;
                result=b[i].substring(0,max);
            }
        }
        return result;
    }
    public static  int get1(String s1,String s2){
        if(s1.length()==0||s2.length()==0){
            return 0;
        }
        int i=0;
        while(i<s1.length()&&i<s2.length()&&s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return i;
    }
}
