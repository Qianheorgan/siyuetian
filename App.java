import java.util.*;

public class App
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String[] e = new String[a];
        Set<String> set = new HashSet<>();
        in.nextLine();
        for (int i = 0; i < a; i++) {
            String c=in.nextLine();
            e[i] = c;

        }
        for (int j = 0; j < a; j++) {
            String[] b = e[j].split("->");
            System.out.println(Arrays.toString(b));
            set.add(b[0]);
            if (set.contains(b[1])) {
                System.out.println("Y");
                return;

            }

        }
        System.out.println("N");
    }}

