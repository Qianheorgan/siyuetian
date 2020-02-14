
import java.util.Scanner;
public class StringReverse1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        String[] m = a.split(";");
        if(m[0].length()!=m[1].length()){
            System.out.print(false);
            return;
        }
        m[0] = m[0]+m[0];
        System.out.print(m[0].contains(m[1]));
    }
}