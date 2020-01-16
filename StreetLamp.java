import java.util.Scanner;

public class StreetLamp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
         for(int i=0;i<a;i++){
             int m=in.nextInt();
             String s=in.next ();
             int count=0;
             for(int j=0;j<m;j++){
                 if(s.charAt(j)=='.'){
                     count++;
                     j+=2;
                 }
             }
             System.out.println(count);
         }

    }
}
