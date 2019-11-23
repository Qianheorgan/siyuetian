import java.util.Scanner;

public class Samegrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                int a=scanner.nextInt();
                int []b =new int[a];
                for(int i=0;i<a;i++){
                    b[i]=scanner.nextInt();
                }
                int c=scanner.nextInt();
                int count=0;
                for(int j=0;j<a;j++){
                    if(b[j]==c){
                        count++;
                    }
                }
                System.out.println(count);

            }
    }

}
