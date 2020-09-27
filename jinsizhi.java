import java.util.*;



public class jinsizhi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int q=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        //System.out.println(Arrays.toString(a));

         Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<q;i++){
             queue.add(in.nextInt());

        }
         while(!queue.isEmpty()){
            int w=get(a,queue.poll());
            System.out.println(w);
        }
    }
    public  static int get(int [] a,int b){
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        int d=0;
        for(int i=0;i<a.length;i++){
            int c=Math.abs(a[i]-b);
            if(c<min){
                min=c;
                d=i;
            }
        }
        return a[d];
    }
}
