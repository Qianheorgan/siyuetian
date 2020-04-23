
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class BlackTea {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int need = Integer.parseInt(br.readLine());
        int[] blood = new int[n];
        for (int i = 0; i < blood.length; i++) {
            blood[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(blood);
        int left = 0;
        int right = n - 1;
        boolean flag = false;
        while (left < right) {
            if (blood[left] + blood[right] == need) {
                flag = true;
                System.out.println(blood[left] + " " + blood[right]);
                left++;
            } else if (blood[left] + blood[right] > need) {
                right--;
            } else {
                left++;
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
    }
}