import javafx.concurrent.ScheduledService;

        import java.util.Scanner;

public class Reversesentence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine().trim();
        String[] a=s.split(" ");
        StringBuffer b=new StringBuffer();
        for(int i=a.length-1;i>=0;i--){
            b.append(a[i]);
            b.append(" ");
        }
        System.out.println(b);
    }
}
