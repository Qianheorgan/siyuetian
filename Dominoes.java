
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dominoes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = s.length();
        int[] ltor = new int[n];
        //模拟往右边推，每个骨牌倒下的先后顺序
             int[] rtol = new int[n];
             //模拟往左边推，每个骨牌倒下的先后顺序
            boolean isPush = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    ltor[i] = 1;
                    isPush = true;
                } else if (s.charAt(i) == 'L') {
                    isPush = false;
                } else if (isPush) {
                    ltor[i] = ltor[i - 1] + 1;
                }
            }
            isPush = false;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'L') {
                    isPush = true;
                    rtol[i] = 1;
                } else if (s.charAt(i) == 'R') {
                    isPush = false;
                } else if (isPush) {
                    rtol[i] = rtol[i + 1] + 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (ltor[i] == rtol[i]){
                    sb.append('.');
                }else if (ltor[i] == 0 && rtol[i] != 0){
                    //ltor[i] == 0，往左边倒
                               sb.append('L');
                }else if (ltor[i] !=0 && rtol[i] == 0) {
                    //rtol[i] = 0 往右边的倒
                    sb.append('R');
                }else if (ltor[i] < rtol[i]){
                    //往右边倒的时间小于往左边推到的时间，所以先往右边先倒
                    sb.append('R');
                }else if (ltor[i]>rtol[i]){
                    sb.append('L');
                }
            }
            System.out.println(sb.toString());
    }
}

