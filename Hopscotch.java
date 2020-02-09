
import java.util.*;
public class Hopscotch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {      
            if (i <= 2) {
                list.add(i);
            } else {
                list.add(list.get(i - 3) + list.get(i - 2));
            }
        }
        System.out.println(list.get(list.size() - 1));
    }
}