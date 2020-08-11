public class Front{
    public static void main(String[] args) {
        int [] array={2,3,5,3,2,4};
        reOrderArray(array);
    }
    public static void reOrderArray(int [] array) {
        int j;int key;
        for(int i=1;i<array.length;i++){
            key=array[i];
            if((key&1)==0) continue;
            j=i-1;
            while(j>=0&&(array[j]&1)==0){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }

    }
}