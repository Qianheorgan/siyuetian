import java.util.Arrays;

public class Nullexchange {


        public static int[] exchangeAB(int[] AB) {
            AB[0]=AB[0]^AB[1];
            AB[1]=AB[0]^AB[1];
            AB[0]=AB[0]^AB[1];
            return AB;

        }
       public static void main(String[] args) {
        int[]a={1,2};

           System.out.println(Arrays.toString(exchangeAB(a)));
    }
}
