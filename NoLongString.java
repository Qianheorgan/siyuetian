import java.util.*;


public class NoLongString {
    
    public int maxLength (int[] arr) {
        // write code here
        int len=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        while(left<len){
            int a=-1;
            for(int i=left;i<len;i++){
                if(map.containsKey(arr[i])){
                    a=arr[i];
                    break;
                }
                map.put(arr[i],i);

            }
            if(a==-1){
                return Math.max(max,map.size());
            }else {
                left=map.get(a)+1;
                max=Math.max(max,map.size());
                map.clear();
            }
        }
        return max;
    }
}