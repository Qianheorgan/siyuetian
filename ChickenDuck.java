
import java.util.Scanner;
public class ChickenDuck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input="";
        int result=0;
        input=scanner.nextLine();
        String[] s=input.split("");
        int l=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("C")){
                result+= i-l;
                l++;
            }
        }
        System.out.println(result);
    }
}