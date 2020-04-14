
public class Cultivateflowers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int[] target = new int[N];
        for (int i = 0; i < N; ++i) {
            target[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i < N; ++i) {
            if (target[i - 1] > target[i]) {
                cnt += target[i - 1] - target[i];
            }
        }
        System.out.println(cnt + target[N - 1]);
    }
}