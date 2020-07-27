import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stickpuzzle {
    public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    int n=in.nextInt();

    int j=0;
    int num=0;
    int max=0;
    List<Integer> list=new ArrayList<>();
    while(j++<n){
        int m=in.nextInt();
        int a=in.nextInt();
        if(m==1){
            list.add(a);
            num+=a;
        }
        else{
            list.remove(list.indexOf(a));
            num-=a;
        }
        Collections.sort(list);
        if(list.size()>0){
         max=list.get(list.size()-1);}
        if(num-max<=max){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    }

}
