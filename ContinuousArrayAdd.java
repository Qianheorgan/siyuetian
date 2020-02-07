
import java.util.Scanner;
public class ContinuousArrayAdd {
    public static void main(String[] args) {
        //前面用来处理不知道元素个数的数组，通过字符串来转化
          Scanner input = new Scanner(System.in);
          String str = input.nextLine();
          String[] newstr = str.split(",");
          int[] num = new int[newstr.length];
          for(int i=0; i<newstr.length; i++)
              num[i] = Integer.valueOf(newstr[i]);
          //其实max这样设置也就是让它在第一次比较的时候，保证max一定能取上cur_sum的值
             int max = Integer.MIN_VALUE, cur_sum = 0;
             for(int i=0; i<num.length; i++) {
                 //如果当前累积的数是一个负数，那我直接抛弃该累积的数，取当前数
                 // 那为什么累积的数被抛弃了，还能有负数的情况？是因为当前数也是一个负数
                          if(cur_sum <= 0)
                              cur_sum = num[i];
                          else
                              cur_sum += num[i];
                          if(max < cur_sum)
                              max = cur_sum;
             }
             //这种三元表达式就很简洁漂亮
            System.out.println(max > 0 ? max : 0);
    }
}