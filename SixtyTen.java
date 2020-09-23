import java.util.*;
import java.util.regex.Pattern;

public class SixtyTen {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int a=1;
        boolean flag=true;
        int n=0;
        long sum=0;

        if(s.substring(0,1).equals("-")){
             a=-1;
             flag=false;
        }
        String s1=Pattern.compile("[^0-9a-zA-Z]").matcher(s).replaceAll("");
       //System.out.println(s1);
        for(int i=s1.length()-1;i>=0;i--){
            int  b=(int)s1.charAt(i);
           // System.out.println(b);
            if(b>=97&&b<=122){
                b=b-87;
            }
            if(b>=48&&b<=57){
                b=b-48;
            }
             // System.out.println(b);

            sum=sum+b*(long)Math.pow(36,n);
            if(sum<(long)b*(long)Math.pow(36,n)){
                sum=9223372036854775807L;

                break;
            }
            n++;


        }



        if(flag){
        System.out.println(sum);
    }else{
            System.out.println(sum*a);
        }
    }

}
