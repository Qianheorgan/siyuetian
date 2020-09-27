import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    for(int k=j+1;k<n;k++){
                        if(a[j]<=a[k]){
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
