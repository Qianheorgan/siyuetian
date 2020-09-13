import java.util.Scanner;
//上升子序列个数
public class UPString{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String []s= in.nextLine().split(" ");
        int number=s.length;
        int [] arr=new int[number];
        for(int i=0;i<number;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        int result=1;
        int[] dp=new int[number];
        dp[0]=1;
            for(int i=0;i<number;i++){
                dp[i]=1;
                for(int j=0;j<i;j++){
                    if(arr[j]<arr[i]&&dp[j]>=dp[i]){
                        dp[i]=dp[j]+1;
                        result=dp[i]>result?dp[i]:result;
                    }
                }
            }
            System.out.println(result);

        }
    }
