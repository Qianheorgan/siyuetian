import java.util.Scanner;

public class NumberStatis {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         while(in.hasNextLine()){
             String s=in.nextLine();
             int [] count =new int[26];
             for(int i=0;i<s.length();i++){
                 char ch=s.charAt(i);
                 if(ch>'A'&&ch<'Z'){
                     count[ch-'A']++;
                 }
             }
             for(int i=0;i<26;i++){
                 System.out.printf("%c:%d%n",'A'+i,count[i]);
             }
         }
    }
}
