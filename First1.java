public class First {
    public static void main(String[] args) {
        int[] a={1,2,5,4,3};
        Max(a);
    }
    public static void  Max(int [] a){

        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i]){
                System.out.println(a[i]);
                return;
            }
        }

    }
}
