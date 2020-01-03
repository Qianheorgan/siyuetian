public class ROL {
    public String LeftRotateString(String str,int n) {


        if (str == null || str.length() == 0 || n <= 0) {
            return str;
        }
        String p = str.substring(0, n);
        String q = str.substring(n, str.length());
        return q + p;
    }
    }
