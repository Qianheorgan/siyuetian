public class Firstone {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abcdefdssdaa"));
    }
    public static  int FirstNotRepeatingChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            
            if (str.indexOf(t) == i && str.lastIndexOf(t) == i){
                return i;
            }
        }
        return -1;
    }
}