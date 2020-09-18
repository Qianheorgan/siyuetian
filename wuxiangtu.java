import java.util.*;
import java.util.regex.Pattern;

public class wuxiangtu{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String w=Pattern.compile("[^0-9]").matcher(a).replaceAll("");
        String[] a1=w.split("");

        int[][]b=new int[a1.length][2];
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
            b[i][0]=Integer.parseInt(a1[i]);
            b[i][1]=Integer.parseInt(a1[i]);
        }
        System.out.println(Arrays.toString(b));
//        int[][]edges={{1,2},{2,3},{3,4},{4,5},{2,5}};
String s=removeOneConnection( b);
//

       // System.out.println(s);
    }
    public static String removeOneConnection(int[][]edges){
        String a="Y"; String b="N";
        int n=0;
        Set<Integer> set=new HashSet<>();
        int len=edges.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<2;j++){
                if(!set.contains(edges[i][j])){
                    set.add(edges[i][j]);
                    n++;
                }

            }
        }
        if(len>n-1){
            return a;
        }
        return b;
    }
}