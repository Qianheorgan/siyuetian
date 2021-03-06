//数组中重复的数字
public class T001 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        if(numbers == null || length == 0){
            return false;
        }


        int index = 0;
        while (index < length) {
            if (numbers[index] == index) { // 当前下标index的值刚好为index
                index++;
            } else {
                int tmp = numbers[index];
                if (tmp == numbers[tmp]) { // 要交换位置的两个数相同
                    duplication[0] = tmp;
                    return true;
                } else { // 交换位置
                    numbers[index] = numbers[tmp];
                    numbers[tmp] = tmp;
                }
            }

        }      return false;
    }
}
