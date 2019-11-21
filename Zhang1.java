import java.util.ArrayList;
public class Zhang1 {



    //用栈实现队列（两个栈）

        private ArrayList<Integer> in;
        private ArrayList<Integer> out;

        //构造方法
        public Zhang1(){
            in = new ArrayList<>();
            out = new ArrayList<>();
        }

        //入队列
        public void push(int x) {
            in.add(x);
        }

    public int pop() {
        if (out.isEmpty()) {
            int size = in.size();
            for (int i = 0; i < size; i++) {
                int v = in.remove(in.size() - 1);
                out.add(v);
            }
        }

        return out.remove(out.size() - 1);
    }

    public int peek() {
        if (out.isEmpty()) {
            int size = in.size();
            for (int i = 0; i < size; i++) {
                int v = in.remove(in.size() - 1);
                out.add(v);
            }
        }

        return out.get(out.size() - 1);
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
        }


