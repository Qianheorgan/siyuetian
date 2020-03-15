
import java.util.ArrayList;
import java.util.Scanner;
public class WonderfulDate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            list.add(scanner.nextInt());
        }
        int result=0;
        int i=0;
        while (i<=list.size()-3){
            int secondIndex=list.lastIndexOf(list.get(i));
            result+=secondIndex-i-1;
            list.remove(secondIndex);
            i++;
        }
        System.out.println(result);
    }
}