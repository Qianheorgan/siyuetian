import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(getNumber(a));
    }

    public static int getNumber(int mounth){
        if(mounth == 1 || mounth == 2){
            return 1;
        }
        int tempold = 1;
        int tempyoung = 1;
        int mounth1 = 1;
        int mounth2 = 0;
        for(int j = 4; j <= mounth; j++){
            //第一步，第二个月的变成了有生育能力的兔子
                     tempold += mounth2;
            // 第二步，一个月大的兔子变成了两个月大的兔子
                     mounth2 = mounth1;
            // 第三步，有生育能力的兔子生出了一个月大的小兔子
                   mounth1 = tempold;
            // 当月小兔子的个数
             tempyoung = mounth1 + mounth2;
               }
              return tempold + tempyoung;
             }
}

