import java.util.*;
public class Driver {
    static int d=0;
    static int c=0;
    static int []d1=new int[1000];
    static int[] c1=new int[1000];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum=0;
        int[][]s=new int[1000][2];
        int i=-1;
        while (!cin.hasNext("#")){
            i++;
            int incomeOfA =  cin.nextInt();
            int incomeOfB =  cin.nextInt();
            s[i][0]=incomeOfA;s[i][1]=incomeOfB;
            sum+=get(incomeOfA,incomeOfB);
        }
      if(d==c){
            System.out.println(sum);
            return;
      }else if(d>c){
             Arrays.sort(d1);
             for(int j=0;j<d-c;j++){
                 for(int k=0;k<i;k++){
                     if(d1[j]==s[k][1]){
                         sum-=d1[j];
                         sum+=s[k][0];
                     }
                 }
             }

      }else{
          Arrays.sort(c1);
          for(int j=0;j<c-d;j++){
              for(int k=0;k<i;k++){
                  if(d1[j]==s[k][0]){
                      sum-=c1[j];
                      sum+=s[k][1];
                  }
              }
          }
      }
        System.out.println(sum);

    }

    public static int get(int a,int b){
        if(a>b){
            c1[c]=a;
            c++;
            return a;}
            d1[d]=b;
        d++;
        return b;
    }
}