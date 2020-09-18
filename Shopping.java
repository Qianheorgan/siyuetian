import  java.util.*;
public class Shopping {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int money=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
//        System.out.println(money);
//        System.out.println(s);
        String[] a=s.split(",");
     //  System.out.println(Arrays.toString(a));
        int[] items=new int[a.length];
        for(int i=0;i<a.length;i++){
            items[i]=Integer.parseInt(a[i]);
        }

        System.out.println(buy(money,items));

    }
    public  static int buy(int money,int[] items){
         int dp[]=new int[money+1];
          dp[0]=1;
          for(int i=0;i<items.length;i++){
              for(int j=items[i];j<=money;j++){
                  dp[j]+=dp[j-items[i]];
              }
          }
          return dp[money];
    }
}
