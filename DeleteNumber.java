import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=in.nextInt();
        String[] s1=s.split("");
        int [] a=new int[s.length()];
        int m=s.length()-n;
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s1[i]);
        }

        for(int i=0;i<a.length ;i++){
             for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){

                Delete(a,j);
                n--;
                break;
            }
            if(n==0){
                    S(a,m);
                    return;
            }

        }
        }

    }
    public static  void Delete(int [] a,int j){
        for(int s=j;s<a.length-1;s++){
            a[s]=a[s+1];
        }
    }
    public static void S(int [] a,int m){
          for(int i=0;i<m;i++){
              System.out.printf("%d",a[i]);
          }


    }
}
