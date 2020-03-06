
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordVerifyqualified{
    public static void main(String[] args){
        PasswordVerifyqualified ma=new PasswordVerifyqualified();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(ma.isLengthQualified(str)&&
                    ma.isContentQualified(str)&&
                    !ma.hasDuplicatedString(str))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
        sc.close();
    }
    public boolean isLengthQualified(String s){
        return s.length()>8;
    }
    public boolean isContentQualified(String s){
        int count=0;
        String[] str={"[a-z]","[A-Z]","[0-9]","[^a-zA-Z0-9]"};
        for(int i=0;i<str.length;i++){
            Pattern p=Pattern.compile(str[i]);
            Matcher m=p.matcher(s);
            if(m.find())
                count++;
        }
        return count>=3;
    }
    public boolean hasDuplicatedString(String s){
        for(int i=0;i<s.length()-3;i++){
            if(s.substring(i+3).contains(s.substring(i,i+3)))
                return true;
        }
        return false;
    }
}