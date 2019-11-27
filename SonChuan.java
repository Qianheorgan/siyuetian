import java.util.*;
public class SonChuan {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[]p=new String[n];
        for(int i=0;i<n;i++){
            p[i]=scanner.nextLine();
        }
        String s=scanner.nextLine();
        System.out.println(Arrays.toString(chkSubStr(p,n,s)));
    }

        public static boolean[] chkSubStr(String[] p, int n, String s) {
            boolean []a=new boolean[n];
            for(int i=0;i<n;i++){
                if(s.contains(p[i])){
                    a[i]=true;
                }
                else{
                    a[i]=false;
                }
            }
            return a;
        }

}
