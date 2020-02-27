
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AtomicNumber{
    private static String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char)('A' + i / 27));
        if (i % 27 != 0) sb.append((char)('a' + i % 27 - 1));
        return sb.toString();
    }
    private static int[] process(char[] chs, int i, int j) {
        int[] res = new int[26 * 27];
        while (i < j + 1) {
            if (chs[i] >= 'A' && chs[i] <= 'Z') {
                char c = chs[i];
                if (i + 1 < j + 1 && chs[i + 1] >= 'a' && chs[i + 1] <= 'z') {
                    i++;
                    int k = (c - 'A') * 27 + 1 + (chs[i] - 'a');
                    if (i + 1 < j + 1 && Character.isDigit(chs[i + 1])) {
                        int p = 0;
                        i++;
                        while (i < j + 1 && Character.isDigit(chs[i])) {
                            p = p * 10 + chs[i++] - '0';
                        }
                        res[k] += p;
                    } else {
                        res[k]++;
                        i++;
                    }
                } else if (i + 1 < j + 1 && Character.isDigit(chs[i + 1])) {
                    int p = 0;
                    i++;
                    while (i < j + 1 && Character.isDigit(chs[i])) {
                        p = p * 10 + chs[i++] - '0';
                    }
                    res[27 * (c - 'A')] += p;
                } else {
                    res[27 * (c - 'A')]++;
                    i++;
                }
            } else {
                int cnt = 1;
                int start = ++i;
                while (i < j + 1 && cnt != 0) {
                    if (chs[i] == '(') cnt++;
                    else if (chs[i] == ')') cnt--;
                    i++;
                }
                int[] sub = process(chs, start, i - 2);
                int p = chs[i++] - '0';
                while (i < j + 1 && Character.isDigit(chs[i])) {
                    p = p * 10 + chs[i++] - '0';
                }
                for (int k = 0; k < sub.length; k++) {
                    res[k] += sub[k] * p;
                }            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int[] res = process(s.toCharArray(), 0, s.length() - 1);
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                System.out.print(toString(i));
                if (res[i] > 1) System.out.print(res[i]);
                }
        }
        System.out.println();
        bf.close();
    }
}