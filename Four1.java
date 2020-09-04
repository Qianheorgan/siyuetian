import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Four {
    public static void main(String[] args) {
        String str="abcabced";
        System.out.println(noDuplicate(str));
    }

    public static String noDuplicate(String str) {
        if(str==null||str.length()==0){
            return null;
        }
        Set<String> set = new HashSet<>();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                set.add(s);
            }
        }
        int max = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            LinkedHashSet<String> setchar = new LinkedHashSet<>();
            String  st = iterator.next().toString();
            for (int a = 0; a < st.length(); a++) {
                setchar.add(String.valueOf(st.charAt(a)));
            }
            if(setchar.size()==st.length()){
                int len = st.length();
                if(max<len){
                    max = Math.max(max, len);
                    result = st;
                }
            }
        }

        return result;
    }
}


