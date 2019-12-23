import java.util.Arrays;

public class ArrayToSmallNumber {
    public static void main(String[] args) {
        int [] e={3,32,321};
        System.out.println(PrintMinNumber(e));
    }
    public static String PrintMinNumber(int [] numbers) {

        if(numbers == null || numbers.length == 0)return "";
        for(int i=0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int sum1 = Integer.valueOf(numbers[i]+""+numbers[j]);
                int sum2 = Integer.valueOf(numbers[j]+""+numbers[i]);
                if(sum1 > sum2){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }

            }
        }
        String str = new String("");
        for(int i=0; i < numbers.length; i++)
            str = str + numbers[i];
        return str;
    }
}
