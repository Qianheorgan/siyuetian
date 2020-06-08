

import java.util.Scanner;
public class Commoditytransaction {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc  =new Scanner(System.in);
        int len = sc.nextInt();
        int[] in = new int[len];
        int judge = -1,time = 0;
        long out = 0;
        for(int i=0;i<len;i++){
            in[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<len-1;i++){
            if(judge==-1){
                if(in[i]<in[i+1]){
                    judge = in[i];
                    time++;
                }
            }else{
                if(judge<in[i]&&in[i]>in[i+1]){
                    out+=in[i]-judge;
                    time++;
                    judge = -1;
                }
            }
        }
        if(judge!=-1){
            out+=in[len-1]-judge;
            time++;
        }
        System.out.println(out+" "+time);
    }
}