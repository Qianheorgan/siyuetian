
import java.util.Scanner;
        import java.util.Stack;

public class kuohao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String t = get(s);
            System.out.println(t);
        }
    }

    public static String get(String s) {
        String w = "Yes";
        String q = "No";
        Stack<String> stack = new Stack<>();
        String[] s1 = s.split("");
        for(int i=0;i<s1.length;i++){
            if(s1[i].equals("(")||s1[i].equals("[")||s1[i].equals("{")){
                stack.push(s1[i]);
            }
            if(s1[i].equals(")")||s1[i].equals("]")||s1[i].equals("}")){
                if(stack.isEmpty()) return q;
                if(stack.peek().equals(")")&&s1[i].equals("(")||
                        stack.peek().equals("}")&&s1[i].equals("{")||
                        stack.peek().equals("]")&&s1[i].equals("[")){
                    stack.pop();
                }else {
                    return q;
                }
            }
        }
        if(stack.isEmpty())return w;
        return q;
    }
}