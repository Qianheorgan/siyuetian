import java.util.*;
public class AddTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        //满二叉树应该只需要中序遍历就可以确定唯一的树，所以不保存第一行输入
             String zhong = sc.nextLine();
             String[] split = zhong.split(" ");
             int[] a = new int[split.length];
             //中序遍历保存到数组a中
          for(int i=0;i<a.length;i++) {
              a[i] = Integer.parseInt(split[i]);
          }
          int[] ans = new int[a.length];
          //保存中序遍历的输出结果
           fun(a,0,a.length-1,ans);
           for(int i:ans){
               System.out.print(i+" ");
           }
           sc.close();
    }
    private static int fun(int[] a,int left,int right,int[] ans) {
        int mid = (right+left)/2;
        //中间元素不参与这一轮的计算
             if(right-left==2) {
                 //出口条件
                    ans[mid] = a[right] + a[left];
                    ans[left] = 0;
                    ans[right] = 0;
                    return a[mid]+ans[mid];
             }else {
                 ans[mid] = fun(a,left,mid-1,ans) + fun(a,mid+1,right,ans);
                 return a[mid]+ans[mid];
             }
    }
}
