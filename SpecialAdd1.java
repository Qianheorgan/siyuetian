public class SpecialAdd{
    public int Add(int num1,int num2) {


        if(num1 == 0){
            return num2;
        }
        else if(num2 == 0){
            return num1;
        }
        else{
            int sum;
            while(num2 != 0){
                //先按位异或，在按位与运算，循环即可实现加和，直到num2为0
                sum = num1 ^ num2;
                //按位异或运算（这个有自带的函数，直接用即可）
                num2 = (num1 & num2) << 1;
                //按位与运算（这个函数直接即可）
                num1 =sum;

            }
            return num1;
        }    }
}