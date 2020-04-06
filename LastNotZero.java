import java.util.*;
public class LastNotZero{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=n;
        }
        char[] a=String.valueOf(sum).toCharArray();
        for(int j=a.length-1;j>=0;j--){
            if(a[j]!='0'){
                System.out.println(a[j]);
                break;
            }

        }
    }
}