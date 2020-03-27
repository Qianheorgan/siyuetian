 import java.util.Scanner;
public class Circus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int a[][] = new int[N][3];
        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            String b[]=str.split(" ");
            for (int j = 0; j < 3; j++) {
                a[i][j]=Integer.parseInt(b[j]);
            }
        }
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(a[i][1]<=a[j][1]){
                    int b = a[i][1] ;
                    a[i][1] = a[j][1] ;
                    a[j][1]=b ;
                    int c = a[i][2] ;
                    a[i][2] = a[j][2] ;
                    a[j][2]=c ;
                }
            }
        }
        int count=N ;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(a[i][2]<a[j][2]){
                    count-- ;
                }
            }
        }
        System.out.println(count);
    }
}