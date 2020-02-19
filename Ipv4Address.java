
import java.util.HashSet;
import java.util.Scanner;
public class Ipv4Address{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (!scanner.hasNext("end")) {
            String command = scanner.next();
            char c = command.charAt(0);
            String ip = command.substring(2);
            switch (c) {
                case 'i':
                    set.add(ip);
                    System.out.println("ok");
                    break;
                    case 'd':
                        set.remove(ip);
                        System.out.println("ok");
                        break;
                        case 's':
                            System.out.println(set.contains(ip));    
                            break;
            }
        }
    }
}