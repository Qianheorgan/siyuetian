import java.util.Scanner;

public class Coordinatemove {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
        String s=in.nextLine();
        String[] s1=s.split(";");
        int m=0; int n=0;
        for(String a: s1){
            if(a.charAt(0)=='A'&&a.substring(1).matches("[0-9]+")){
                m-=Integer.parseInt(a.substring(1));
            }
            if(a.charAt(0)=='D'&&a.substring(1).matches("[0-9]+")){
                m+=Integer.parseInt(a.substring(1));

            } if(a.charAt(0)=='W'&&a.substring(1).matches("[0-9]+")){
                n+=Integer.parseInt(a.substring(1));

            } if(a.charAt(0)=='S'&&a.substring(1).matches("[0-9]+")){
                n-=Integer.parseInt(a.substring(1));
            }
        }
        System.out.println(m+','+n);
    }
    in.close();
    }

}
