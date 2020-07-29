import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] a=s.toCharArray();
        int i=0;int j=a.length-1;
        boolean result=true;
       while(i<j){
        if(a[i]!=a[j])
        {
              result=Get(a,i+1,j)||Get(a,i,j-1);
              break;
        }
           i++;
           j--;
       }
        System.out.println(result?"YES":"No");
    }
    public static boolean Get(char[] a,int i,int j){

         int m=i;int n=j;
         while(m<n){
             if(a[m++]!=a[n--]){
                 return false;
             }
         }
         return true;
    }
}
