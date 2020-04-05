
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TimeConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int hour = Integer.parseInt(str.substring(0, 2));
        String min_sec = str.substring(2, 8);
        if (str.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        }
        else if (str.equals("12:00:00PM")) {
            System.out.println("12:00:00");
        }
        else if (str.charAt(8) == 'P') {
            System.out.println((hour + 12) + min_sec);
        } else {
            System.out.println(str.substring(0, 8));
        }
    }
}