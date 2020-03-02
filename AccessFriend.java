
import java.util.Scanner;
public class AccessFriend{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int m = x/5;
        if (x%5 != 0)
            m++;
        System.out.println(m);
    }
}