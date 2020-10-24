


import java.util.Scanner;

public class Sheep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();int b=in.nextInt();
        int c=in.nextInt();int d=in.nextInt();

        System.out.println(get(d));
    }
    public static int get(int year){
        int num=1;
        for(int i=1;i<year;i++){
            if(i==2){
                num+=get(year-2);
            }
            else if(i==4){
                num+=get(year-4);
            }
            else  if(i==5){
                num--;
            }
        }
        return num;
    }
}
