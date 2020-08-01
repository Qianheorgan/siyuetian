import java.util.Scanner;

public class WordReverseSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            String[] a=s.split("[^a-zA-Z]+");
            StringBuffer result=new StringBuffer();

            for(int i=a.length-1;i>=0;i--){
                result.append(a[i]+" ");
            }
            System.out.println(result.toString().trim());
        }
        in.close();
    }
}
