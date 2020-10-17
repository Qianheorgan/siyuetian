import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class erjinzhione {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] findNumber(int num) {
        int[] a=new int[2];
        int c01=0;
        int c11=0;
        int c1=0;
        int c0=0;
        int c=num;int d=num;
        while(((c&1)==0)&&(c!=0)){
            c01++;
            c>>=1;
        }
        while((c&1)==1){
            c11++;
            c>>=1;
        }
        while ((d&1)==1){
            c1++;
            d>>=1;
        }
        while (((d&1)==0)&&(d!=0)){
            c0++;
            d>>=1;
        }
        a[1]=num-(1<<(c1))-(1<<(c0-1))+1;
        a[0]=num+(1<<(c11-1))+(1<<c01)-1;
return  a;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _num;
        _num = Integer.parseInt(in.nextLine().trim());

        res = findNumber(_num);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
