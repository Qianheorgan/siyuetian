
import java.util.Scanner;
import java.util.ArrayList;
public class Bitcoin{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> coin=new ArrayList<>();
        while(in.hasNextInt()){
            coin.add(in.nextInt());
        }
        Integer[] co=new Integer[coin.size()];
        coin.toArray(co);
        int profit=0;
        for(int i=co.length-1;i>=0;i--)
            for(int j=0;j<i;j++){
            profit=Math.max((co[i]-co[j]),profit);
        }
        System.out.println(profit);
    }
}