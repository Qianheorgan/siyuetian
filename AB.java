
import java.util.*;
public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0) {
            System.out.println(a / b);
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        StringBuilder decimal = new StringBuilder();
        res.append(a / b).append('.');
        int index = 0;
        while(a != 0) {
            a = a % b * 10;
            if(map.containsKey(a)) {
                String str = decimal.toString();
                String fixed = str.substring(0, map.get(a));
                String loop = str.substring(map.get(a));
                res.append(fixed).append('(').append(loop).append(')');
                System.out.println(res.toString());
                return;
            }
            decimal.append(a / b);
            map.put(a, index ++);
        }
        System.out.println(res.append(decimal).toString());
    }
}