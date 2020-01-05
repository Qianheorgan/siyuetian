public class Stack  {


    private static int maxSize ;   //栈容量
    private static int[] data ;
    private static int top  ;  //栈顶指针
    Stack(){
        this(10);   //默认栈大小为10
    }
    Stack(int initialSize){
        if(initialSize >=0){
            this.maxSize = initialSize;
            data = new int [initialSize];
            top =-1;
        }else{
            throw new RuntimeException("初始化大小不能小于0：" + initialSize);
        }
    }

    //判空
    public   boolean empty( ){
        return top==-1? true : false;
    }

    //进栈,第一个元素top=0；
    public    boolean push(int e ){
        if(top == maxSize -1){
            throw new RuntimeException("栈已满，无法将元素入栈！");
        }else{
            data[++top]=e;
            return true;
        }
    }

    //查看栈顶元素但不移除
    public   int peek( ){
        if(top == -1){
            throw new RuntimeException("栈为空！");
        }else{
            return  data[top];
        }
    }
    //判断栈满
    public boolean isFull(){
        return maxSize-1==top;
    }
    //弹出栈顶元素
    public   int  pop( ){
        if(top == -1){
            throw new RuntimeException("栈为空！");
        }else{
            return  data[top--];
        }
    }



    public static void main(String[] args) {
        Stack liu=new Stack(10);
        System.out.println(liu.empty());
        System.out.println(liu.isFull());
        liu.push(1);
        liu.push(2);
        liu.push(3);
        liu.push(4);
        liu.push(5);
        liu.push(6);
        liu.push(7);
        liu.push(8);
        liu.push(9);
        liu.push(10);


        System.out.println(liu.isFull());

        System.out.println(liu.peek());
        liu.pop();
        System.out.println(liu.peek());
        liu.pop();
        System.out.println(liu.peek());
        liu.pop();
        System.out.println(liu.peek());
        liu.pop();
        System.out.println(liu.peek());
        liu.pop();
        System.out.println(liu.isFull());
        System.out.println(liu.empty());



    }
}