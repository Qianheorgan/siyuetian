import java.math.BigInteger;
import java.util.Scanner;
//超长正整数相加
public class Longnumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String addend=scanner.nextLine();
        String augend=scanner.nextLine();
       AddLongIntger(addend,augend);
    }
    public static void  AddLongIntger(String addend, String augend){
        BigInteger a=new BigInteger(addend);
        BigInteger b=new BigInteger(augend);
        BigInteger c=a.add(b);
        System.out.println(c);
    }
}
