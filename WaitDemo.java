import java.util.Scanner;

public class WaitDemo {
    private static Object object = new Object();

    public static class A extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            // 等待 B 线程启动，并完成某个条件
            //每个对象的等待集(WAITING状态)
            synchronized (object) {
                try {
                    object.wait();//先释放锁(Object里的锁)，把线程放到object等待集中，把状态改为WATING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Thread a = new A();
        a.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("我不输入，A 线程就绝对不会动");
        scanner.nextLine();
        synchronized (object) {
            object.notify();//被唤醒后：把A线程中等待集取出，把A线程状态变为RUNNABLE，尝试重新抢object的锁
        }
    }
}
