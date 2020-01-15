import java.util.ArrayList;

public class SlideWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
           ArrayList<Integer> list=new ArrayList<>();
           if(size<=0){
               return list;
           }
           for(int i=0;i<num.length-size+1;i++){
               int max1=num[i];
               for(int j=i+1;j<size+i;j++){
                   if(num[j]>max1){
                       max1=num[j];
                   }
               }
               list.add(max1);
    }
    return list;
    }

}