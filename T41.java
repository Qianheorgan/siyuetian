public class T41 {
    public static void main(String[] args) {
        int v=lengthOfLastWord("Hello word ");
        System.out.println(v);
    }
    public static  int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==0||s.length()==1){
            return 0;
        }
        String[] a = s.split(" ");
        return a[a.length-1].length();
    }
}
