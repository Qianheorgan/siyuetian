 import  java.util.*;
public class BracketPairing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')'){
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println(false);
                    return;
                }
            }else if (c == ']'){
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println(false);
                    return;
                }
            }
        }
        if (stack.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}