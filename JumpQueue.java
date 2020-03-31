
import java.util.*;
public class JumpQueue {
    /**     * 计算有多少个人最终不在自己原来的位置上
     *  * @param n int整型 队伍总长
     *  * @param cutIn int整型一维数组 依次会插队到最前方的人的编号
     *  * @return int整型     */
    public int countDislocation (int n, int[] cutIn) {
             if(cutIn.length==0){
                 return 0;
             }
             int len=cutIn.length;
             HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
             int index=1;
             int max=Integer.MIN_VALUE;
             for (int i = len-1; i >=0 ; i--) {
                 max=max>cutIn[i]?max:cutIn[i];
                 if(!map.containsKey(cutIn[i])){
                     map.put(cutIn[i],index++);
                 }
             }
             int num=0;
             for(Integer key : map.keySet()){
                 if(map.get(key)!=key){
                     num++;
                 }
             }
             num+=(n-map.size())-(n-max);
             return num;
    }
}