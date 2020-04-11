import java.util.*;
public class DecreasingArray{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        String[] a=n.split(" ");
        int [] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        int count=0;
        for(int j=0;j<a.length-1;j++){
            if(b[j]>b[j+1]){
                count++;
            }
        }
        if(count>1){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}