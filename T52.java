public class T52 {
    public static void main(String[] args) {
        String name="saeed";
        String typed="ssaaedd";
        System.out.println(        isLongPressedName(name,typed));
    }
    public static  boolean isLongPressedName(String name, String typed) {
        int j=0;
        for(int i=0;i<typed.length();i++){
            if(name.charAt(j)==typed.charAt(i)){
                j++;
            }
            if(j==name.length())
                break;

        }
        return j==name.length()?true:false;

    }

}
