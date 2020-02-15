

import java.util.Scanner;
import static java.lang.System.in;
public class ArrayMode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] str = sc.nextLine().replace("[", "").replace("]", "").split(",");
        int[] data = new int[str.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(str[i]);
        }
        if (data.length == 1 || data.length == 2) {
            System.out.println(data[0]);
            return;
        }
        int hp = 0;
        int flag = data[0];
        for (int i = 0; i < data.length; i++) {
            if (hp == 0) {
                flag = data[i];
                hp++;
            } else if (data[i] == flag) {
                hp++;
            } else{
                hp--;
            }
        }
        System.out.println(flag);
    }
}