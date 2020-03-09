import java.util.*;
public class Ironic{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String[] a1=a.split(" ");
        for(int i=a1.length-1;i>=0;i--){
            System.out.print(a1[i]+" ");
        }
    }
}