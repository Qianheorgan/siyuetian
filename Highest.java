import java.util.Scanner;

public class Highest {
        public static void z(String d,int e,int f,int[]c){
        int max=0;
        if(d.equals("Q")){

            for(int k=e-1;k<f;k++){
                if(max<c[k]){
                    max=c[k];
                }
            }
            System.out.println(max);
        }
        if(d.equals("U")){
            c[e-1]=f;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int[] c = new int[a];
            for (int i = 0; i < a; i++) {
                c[i] = in.nextInt();
            }
            for (int j = 0; j < b; j++) {
                String d = in.next();
                int e = in.nextInt();
                int f = in.nextInt();
                z(d,e,f,c);

            }

        }
    }
}
