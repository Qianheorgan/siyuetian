public class StringReverse {
    public String ReverseSentence(String str) {
        if(str.length()==0&&str==null){
            return str;
        }
        String[] a=str.split(" ");
        if(a.length==0){
            return str;
        }
        String b="";
        for(int i=a.length-1;i>=0;i--){

            b=b+a[i];
            if(i!=0){
                b+=" ";}
        }
        return b;
    }
}
