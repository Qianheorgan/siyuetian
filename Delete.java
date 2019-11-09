
import java.util.Scanner;

public class Delete{
    public static void Delete1( StringBuffer a,StringBuffer b){

        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if( a.charAt(i)==b.charAt(j)){
                    a.delete(i,i+1);
                }
            }

        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        StringBuffer a=new StringBuffer(A);
        StringBuffer b=new StringBuffer(B);

        Delete1(a,b);
    }
}
