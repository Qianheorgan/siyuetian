import java.util.Scanner;

public class plalindrone {

    public plalindrone() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static int number(String  A, String  B){
    StringBuffer a=new StringBuffer(A);
    int count=0;
 for(int i=0;i<A.length()+1;i++){
    a.insert(i,B);
     System.out.println(a);
     StringBuffer b=a.reverse();
     System.out.println(b);
    if( a.equals(b)){
        count++;
    }
     System.out.println(count);
    a.reverse();
    a.delete(i,i+1);

 }

return count;
}



    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        System.out.println( number(A,B));


    }
}
