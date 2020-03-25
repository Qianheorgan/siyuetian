
import java.util.Scanner;
public class PingPong{
    public static void main(String[] args)    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())        {
            boolean contain = true;
            StringBuffer input = new StringBuffer(in.next());
            char[] find = in.next().toCharArray();
            for (char c : find)            {
                int index = input.indexOf(String.valueOf(c));
                if (index != -1)
                    input.deleteCharAt(index);
                else
                    {
                    System.out.println("No");
                    contain = false;
                    break;
                    }
            }
            if (contain)
                System.out.println("Yes");
        }
    }
}