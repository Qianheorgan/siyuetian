import java.util.Scanner;

public class weihurizhi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=0;
        int j=0;
        while(!in.hasNext("0")){
            String a=in.next();
            if(a.equals("Create")){
                i++;

            }
            if(a.equals("Delete")){
                j++;

            }

            }
        if (i > j) {
            System.out.println("Yes");
        }
        if (i == j) {
            System.out.println("No");
        }
        if(i<j){
            System.out.println("ERROR");
        }

        }
    }

