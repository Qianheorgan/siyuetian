

import java.util.Scanner;

public class MCandy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int sum=0;
       for(int i=1;i<n;i++){
             sum+=i;
             if(sum>n){
                 count=i-1;
                 break;
             }
       }
        System.out.println(count);
    }
}
