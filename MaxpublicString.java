import java.util.*;


public class MaxpublicString {
    /**
     * 找出字符串中最大公共子字符串
     * @param str1 string字符串 输入字符串1
     * @param str2 string字符串 输入字符串2
     * @return string字符串
     */
    public static void main(String[] args) {
        String a="abccade";String b="dgcadde";
        System.out.println(GetCommon(a,b));
    }
    public static String GetCommon (String str1, String str2) {
        // write code here
        String []s1=str1.split("");
        String []s2=str2.split("");
        int[][]a=new int[s1.length+1][s2.length+1];
        int b=0;int c=0;int max=0;
        for(int i=1;i<=s1.length;i++){
            for(int j=1;j<=s2.length;j++){
                if(s1[i-1].equals(s2[j-1])){
                    a[i][j]=a[i-1][j-1]+1;
                    if(a[i][j]>max){
                        b=i-1;
                        c=j-1;
                        max=a[i][j];
                        System.out.println(b);
                        System.out.println(max);
                    }


                }
            }
        }
        String q=str1.substring(b-max+1,b+1);
        return  q;
    }
}