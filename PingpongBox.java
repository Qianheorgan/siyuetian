import java.util.Scanner;

public class PingpongBox {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        while(in.hasNext()){char[] a=in.next().toCharArray();
        char[]b=in.next().toCharArray();
        if(get(a,b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    }
    public static  boolean get(char[] a,char [] b){
        int count=0;
        int res=b.length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                    b[j]='\0';
                    break;
                }
            }

        }
        if(count==res){
            return true;
        }
        else {
            return false;
        }
    }
}
