import java.util.Stack;

public class Stack1{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        int a=stack2.pop();
        return a;
    }

    public static void main(String[] args) {
        Stack1 a=new Stack1();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());

    }
}