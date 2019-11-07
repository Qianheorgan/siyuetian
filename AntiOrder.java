import java.util.Scanner;

public class AntiOrder {
    public static int count(int[] A, int n) {
        int count1=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count1++;
                }
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String []B=A.split("");

        int c=scanner.nextInt();
       // count(B,c);
    }
}