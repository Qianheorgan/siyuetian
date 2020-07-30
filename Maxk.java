import java.util.*;
public class Maxk{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++){
            a[i][0]=i+1;
        }
        for(int j=0;j<m;j++){
            a[0][j]=j+1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                a[i][j]=a[i-1][j]*a[i][j-1];
            }
        }
         List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(a[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(n*m-k));
    }

}