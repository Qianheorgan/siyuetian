import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class wordlianxi{


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String Typing(String s) {
         String [] s1=s.split("");
         StringBuffer a=new StringBuffer();
         for(int i=s1.length-1;i>=0;i--){
             if(s1[i].equals("<")){
                  for(int j=i-1;j>=0;j--){
                      if(!s1[j].equals("<")){
                          i=j-(i-j);
                          break;
                      }
                      if(j==0){
                          return a.reverse().toString();
                      }
                  }

             }
            // System.out.println(s1[i]);
             a.append(s1[i]);
         }

return a.reverse().toString();
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
        String s=in.nextLine();
        res = Typing(s);
        System.out.println(res);
    }
}
