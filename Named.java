import java.util.Scanner;

public class Named {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            String[] a=s.split("_");
            String result=a[0];
            for(int i=1;i<a.length;i++){
                 a[0]+=(char)(a[i].charAt(0)-32);
                 for(int j=1;j<a[i].length();j++){
                         result+=a[i].charAt(j);
                 }
            }
            System.out.println(result);
        }

    }
}
