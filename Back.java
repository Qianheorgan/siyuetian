
import java.util.Scanner;

public class Back {
    public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
    String a=scanner.nextLine();
    String [] b=a.split("");
    int[] c=new int[b.length];
    int j=0;
    for(int i=b.length-1;i>=0;i--){
        c[j]=Integer.valueOf(b[i]);
           j++;
    }
    for(int m=0;m<c.length;m++){
        System.out.printf("%d",c[m]);
    }

}}
