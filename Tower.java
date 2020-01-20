import java.util.*;
public class  Tower{
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //塔的数量
         int k=sc.nextInt();
         //最多操作数
         ArrayList<Integer> towers=new ArrayList<>();
         for (int i=0;i<n;i++)
             towers.add(sc.nextInt());
         int count=0;
         int max=Collections.max(towers);
         int min=Collections.min(towers);
         ArrayList<Integer> list1=new ArrayList<>();
         ArrayList<Integer> list2=new ArrayList<>();
         while (max-min>1&&count<k) {
             max=Collections.max(towers);min=Collections.min(towers);
             list1.add(towers.indexOf(max)+1);list2.add(towers.indexOf(min)+1);
             towers.set(towers.indexOf(min),min+1);
             towers.set(towers.indexOf(max),max-1);
             count++;
         }
         System.out.println(Collections.max(towers)-Collections.min(towers)+" "+count);
         for (int i=0;i<list1.size();i++)       {
             System.out.println(list1.get(i)+" "+list2.get(i));
         }
    }
}