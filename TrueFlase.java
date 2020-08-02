import java.util.Scanner;
import java.util.Stack;

public class TrueFlase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] s=in.nextLine().split(" ");
        Stack<String> stack =new Stack<>();
        for(int i=0;i<s.length;i++){
            //true或者false
            if(s[i].equals("true")||s[i].equals("false")){
                if(stack.isEmpty()){
                    stack.push(s[i]);

                }else{
                    String top=stack.peek();
                    if(top.equals("true")||top.equals("false")){
                        System.out.println("error");
                        return;
                    }else{
                        if(top.equals("or")) stack.push(s[i]);
                        else{
                            stack.pop();
                            String a=stack.pop();
                            if(s[i].equals("false")||a.equals("false")) stack.push("false");
                            else{
                                stack.push("true");
                            }
                        }
                    }
                }

            }
            //and或者or
            else{
                if(stack.isEmpty()){
                    System.out.println("error");
                    return;
                }else{
                    String b=stack.peek();
                    if(b.equals("and")||b.equals("or"))
                    {
                        System.out.println("error");
                        return;
                    }
                        stack.push(s[i]);

                }
            }

        }
        if(!stack.isEmpty()&&(stack.peek().equals("and")||stack.peek().equals("or"))){
            System.out.println("error");
            return;
        }
        while(!stack.isEmpty()){
            String c=stack.pop();
            if(c.equals("true")){
                System.out.println("true");
                break;
            }
            if(stack.isEmpty()){
                System.out.println("false");
            }
        }

    }
}
