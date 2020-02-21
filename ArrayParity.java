import java.util.*;
public class ArrayParity{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        String [] b=a.split(" ");
        int[]array=new int[b.length];

       for(int i=0;i<b.length;i++){
           array[i]=Integer.parseInt(b[i]);
       }
        System.out.println(Arrays.toString(array));

        StringBuilder string=new StringBuilder();
        for(int j=0;j<b.length;j++){
            if(array[j]%2==0){
                string.append(Integer.toString(array[j])+" ");
            }

        }
        for(int j=0;j<b.length;j++){
            if(array[j]%2==1){
                string.append(Integer.toString(array[j])+" ");
            }

        }
        System.out.println(string);
    }
}