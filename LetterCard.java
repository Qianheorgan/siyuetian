
import java.util.*;

public class LetterCard {
    private final static Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        while(INPUT.hasNext()){
            long n = INPUT.nextInt();
            long k = INPUT.nextInt();
            String line = INPUT.next();
            Map<Character, Long> characterCount = new HashMap<>();
            countValue(characterCount, line);
            Long[] a = sort(characterCount).clone();
            calculate(k, a);
        }
    }

//计算最大值
private static void calculate(long k, Long[] a) {
    long sum = 0;
    for(long j : a) {
        if(j<=k) {
            k -= j;
            sum += j*j;
            if(k == 0) {
                break;
            }
        }
        }
        sum += k*k;
    System.out.println(sum);
}
//将 Map 中的 value 存入到数组并排序
private static Long[] sort(Map<Character, Long> characterCount) {
    int len = characterCount.size();
    Long[] a = new Long[len];
    int id = 0;
    for(Character c : characterCount.keySet()) {
        a[id++] = characterCount.get(c);
    }
    Arrays.sort(a,(o1,o2)-> o2.compareTo(o1));
    return a;
}
//对每个字母计数
 private static void countValue(Map<Character, Long> characterCount, String line) {
    for(int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (characterCount.get(c) == null) {
            characterCount.put(c, 1l);
        }else {
            characterCount.put(c, characterCount.get(c)+1);
        }
    }
}
}