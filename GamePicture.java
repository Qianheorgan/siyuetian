import java.util.Scanner;

public class GamePicture{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();

        System.out.println((s.length()+1)*26-s.length());
    }
}
