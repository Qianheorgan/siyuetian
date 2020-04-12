
import java.util.Scanner;
public class FindMissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] listStr = sc.next().split(",");
        //将字符串进行分割
         if(listStr.length == 0) return;
         int low = 0;
         int high = listStr.length-1;
         int flag = Integer.valueOf(listStr[0]);
         //第一个元素值。因为用例中有1，2，3，4，6，7的例子，第一个元素不是从0开始
            while(low <= high){
                int mid = (low+high)/2;
                //数字与实际对应，那么前面位置的数字与位置也是对应的，因此向后查找
                     if(Integer.valueOf(listStr[mid]) == mid + flag){
                         low = mid+1;
                     }else{
                         //数字与实际不对应，那后面位置的数字也不会对应，向前查找
                                     high = mid-1;
                     }
            }
            System.out.println(low+flag);
    }
}
