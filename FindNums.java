
import java.util.HashMap;
import java.util.Scanner;
public class FindNums {
    public String findNums(String[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=Integer.parseInt(nums[i]);
            map.put(num[i],i);
        }
        for(int j=0;j<num.length;j++){
            int dif=target-num[j];
            for(int k=j+1;k<num.length;k++){
                int dif2=dif-num[k];
                if(map.get(dif2)!=null){
                    return "True";
                }

            }
        }
        return "False";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String scan=sc.nextLine();
            String[] tmpTest=scan.split(",");
            String[] num=tmpTest[0].split(" ");
            int nums=Integer.parseInt(tmpTest[1]);
            FindNums fn=new FindNums();
            String result=fn.findNums(num,nums);
            System.out.println(result);
        }
    }
}