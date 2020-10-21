import java.util.*;
public class BigIntAdd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] s1=s.split("#");
        String[] a=s1[0].split("");
        String[] b=s1[1].split("");

        int max=a.length>b.length? a.length:b.length;
        int[] c=new int[max+1];
        int[]d=new int[max+1];
        int[] e=new int[max+1];
        int q=0;
        for(int i=a.length-1;i>=0;i--){
            c[q++]=Integer.parseInt(a[i]);

        }
        q=0;
        for(int i=b.length-1;i>=0;i--){
            d[q++]=Integer.parseInt(b[i]);
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        for(int i=0;i<e.length;i++){
            int temp=e[i];
            temp+=c[i];
            temp+=d[i];
            if(temp>=10){
                temp=temp-10;
                e[i+1]=1;
            }
            e[i]=temp;
        }
        StringBuffer t=new StringBuffer();
        boolean flag=false;
        for(int i=e.length-1;i>=0;i--){
            if(!flag){
                if(e[i]==0){
                    continue;
                }
                flag=true;
            }
            t.append(e[i]);
        }
        System.out.println(t);
    }
}