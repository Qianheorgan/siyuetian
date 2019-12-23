public class HowOne {
    public static void main(String[] args) {
        System.out.println(z(123343452));
    }
     public static int z(int n){
         int count = 0;
         while(n>0){
             String str = String.valueOf(n);
             char [] chars = str.toCharArray();
             for(int i=0;i<chars.length;i++){
                 if(chars[i]=='1')
                     count++;
             }
             n--;
         }
         return count;
     }

}

