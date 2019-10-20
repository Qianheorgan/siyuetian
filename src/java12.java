import java.util.*;
public class java12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String c=scanner.nextLine();
        System.out.println(M(s,c));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static int M(String s, String c){
        int count=0;
        String [] array=s.split(" ");
        String [] array1=c.split(" ");
        for(String a:array){
            for(String b:array1){
                if(a.equals(b)){
                    count++;
                }
            }
        }

 return array.length+array1.length-count;
    }
}