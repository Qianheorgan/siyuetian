import java.*;

public class bird extends animal{
            public int a=10;

                public void print(){
                System.out.println("bird");
            }
            public void test(){
                System.out.println(super.a);
                System.out.println(this.a);
                super.print();
                this.print();
            }

    public static void main(String[] args) {
        bird b=new bird();
        b.test();
    }
    }
