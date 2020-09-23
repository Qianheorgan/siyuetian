import java.util.*;
import java.util.regex.Pattern;

public class baojia {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String a1=in.nextLine();
        String b1=in.nextLine();
       // System.out.println(a1);
        String [] a=a1.split(" ");
        String [] b=b1.split(" ");
      //  System.out.println(a.length);
        int [][] s=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 if(a[j-1].equals(b[i-1])){
                     int max=Math.max(s[i-1][j],s[i][j-1]);
                     s[i][j]=Math.max(s[i-1][j-1]+1,max);
                     //System.out.println(s[i][j]);
                 }
                 else {
                     s[i][j]=Math.max(s[i-1][j],s[i][j-1]);
                 }

            }
        }
        System.out.println(s[n][n]);
    }
}
