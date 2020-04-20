
import java.util.*;
public class SimpleExpressionevaluation{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        while (!"END".equals(str = reader.nextLine())) {
            list.add(str);
        }
        list.forEach(SimpleExpressionevaluation::Fun);
    }
    public static void Fun(String str) {
        LinkedList<Integer> nums = new LinkedList<>();
        LinkedList<Character> ops = new LinkedList<>();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int start = i;
                i++;
                while (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                    i++;
                }
                String a = i == str.length() - 1 ? str.substring(start) : str.substring(start, i);
                nums.add(Integer.parseInt(a));
            } else {
                ops.add(str.charAt(i));
                i++;
            }
        }
        Stack<Integer> stack = new Stack<>();
        if (nums.size() < 2) {
            return;
        }
        stack.push(nums.poll());
        stack.push(nums.poll());
        while (!ops.isEmpty()) {
            char op = ops.poll();
            if ((op == '+' || op == '-') && (!ops.isEmpty() && (ops.getFirst() == '*'))) {
                //如果加法、减法后面一个操作是乘法，则乘法优先操作
                         if (!nums.isEmpty()) {
                             stack.push(nums.poll());
                             int a = stack.pop();
                             int b = stack.pop();
                             stack.push(a * b);
                             ops.poll();
                             ops.addFirst(op);
                         } else {
                             return;
                         }
            } else {
                if (op == '+') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                } else if (op == '-') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                } else if (op == '*') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a * b);
                }
                if(!nums.isEmpty()){
                    stack.push(nums.poll());
                }
            }
        }
        System.out.println(stack.pop());
    }
}