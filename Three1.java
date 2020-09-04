
public class Three {
    public static void main(String[] args) {
        String str="ab13Aba1be";
        size(str);
    }
    public static void size(String str){
        int max=0;

        String []a=str.split("");
        String[]b=new String [a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];

            for(int j=0;j<i;j++){
                if(b[j].equals(a[i])){
                    if(max<i-j){
                        max=i-j-1;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
