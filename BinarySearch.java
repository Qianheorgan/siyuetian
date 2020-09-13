 import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Solution ans=new Solution();
        while(sc.hasNextLine()){
            String []targetLine=sc.nextLine().split(" ");
            int[] targets=new int[targetLine.length];
            for(int i=0;i<targetLine.length;i++){
                targets[i]=Integer.parseInt(targetLine[i]);
            }
            int target=Integer.parseInt(sc.nextLine());
            int out=ans.search(targets,target);
            System.out.println(out+"\n");
        }
    }
}
class Solution{
    public int search(int nums[],int target){
        if(nums==null||nums.length==0)return -1;
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]==target){
                right=mid;
            }
        }
        if(nums[left]==target){
            return left;
        }
        return -1;
    }
}