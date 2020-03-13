public class millionaire{
    public static void main(String[] args){
        int  millionaire = 10 * 30;
        int stranger= 1;
        int s = 1;
        for(int  i = 1; i < 30; i ++){
            s  = s * 2;
            stranger += s;
        }
        System.out.print(millionaire + " " + stranger);
    }
}