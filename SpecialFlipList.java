  import java.util.Scanner;
public class SpecialFlipList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {

            String s = sc.next();
            String[] sarr = s.split(",");
            StringBuilder res = new StringBuilder();
            int i = 1;
            int j = sarr.length-1;
            res.append(sarr[0]).append(",");
            while(i<= j) {
                res.append(sarr[j]).append(",");
                if(i+1>j) {
                    break;
                }
                res.append(sarr[i]).append(",");
                i++;
                j--;
            }
            System.out.println(res.substring(0, res.length()-1));
        }
    }
}