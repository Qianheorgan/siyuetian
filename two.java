

public class two{
    public static void main(String[] args) {
        int n= countNumberOf2s(500);
        System.out.println(n);
    }
    public static int countNumberOf2s(int n) {
         int a=0;
         int count=0;
         while(a<=n){
             int b=a;
             while(b>0){
                 if(b==2){
                     count++;
                     break;
                 }
                 int c=b%10;
                 if(c==2){
                     count++;
                 }
                 b=b/10;
             }
             a++;
         }
         return  count;
    }
}