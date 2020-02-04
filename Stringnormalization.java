import java.util.*;
public class Stringnormalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder("");
        int k =0;
        int count = 0;
        char cur = arr[0];
        while(k<arr.length){
            if(arr[k]==cur){
                k++;
                count++;
                if(k==arr.length){
                    sb.append(String.valueOf(cur)+count);
                }
            }else{
                sb.append(String.valueOf(cur)+count);
                cur = arr[k];
                count = 0;
            }
        }
        System.out.println(sb.toString());
    }
}

