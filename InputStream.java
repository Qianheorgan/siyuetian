import java.util.Map;
import java.util.TreeMap;

public class InputStream {

    TreeMap treeMap = new TreeMap<Integer,Integer>();
    public void Insert(Integer num) {
        if(treeMap.containsKey(num))
        {
            int sum = (Integer) treeMap.get(num);
            treeMap.replace(num, sum, sum + 1);
        }else
            {
                treeMap.put(num,1);
            }
    }
    public Double GetMedian() {
        int size = treeMap.size();
        Map.Entry entry = treeMap.firstEntry();
        int i = (int)entry.getValue();
        int mid = (size+1)/2;
        while(i < mid){
            entry = treeMap.higherEntry(entry.getKey());
            i += (int)entry.getValue();
        }
        if(size % 2 == 0 && i == mid){
            return ((int)entry.getKey() * 1.0 + (int)treeMap.higherEntry(entry.getKey()).getKey() * 1.0) / 2;
        }
        return (int)entry.getKey() * 1.0;
    }
}
