import java.util.*;
public class BuyHouse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            //住满了
             if(n == k || n<3 || k<2){
                 System.out.println("0 0");
             }
             else{
                 int result = (n/2 >= k)?(k-1):(n-k);
                 System.out.println("0 "+result);

             }
        }
    }
}