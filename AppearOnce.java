
import java.util.*;
import java.io.*;
public class AppearOnce{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        //会有复杂度过高的提示
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new TreeSet<Integer>();
        // TreeSet：默认是按照升序排列
        String temp;
        while((temp=br.readLine())!=null){
            int num = Integer.valueOf(temp);
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        for(Integer ob:set)
            System.out.print(ob+" ");
    }
}
