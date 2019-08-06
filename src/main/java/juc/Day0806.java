package juc;

/**
 * @author wangchengdong
 * @date 2019/8/6
 * @desc
 * 1.volatile 关键字
 */
public class Day0806 {

    public static volatile boolean[] flag = new boolean[]{true};
    public static void main(String[] args) {
//        boolean flag = true;
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo2 threadDemo2 = new ThreadDemo2(threadDemo.flag);
        new Thread(threadDemo).start();
        new Thread(threadDemo2).start();
    }
}
class ThreadDemo implements Runnable{


    public void run() {
            while (getFlag()){
                System.out.println("==正在执行==");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            System.out.println("==结束运行==");
        }

    public boolean getFlag(){
        return flag[0];
    }
}
class ThreadDemo2 implements Runnable{
    public   boolean[] flag;

    public ThreadDemo2(boolean[] flag) {
        this.flag = flag;
    }
    public void run() {
        try {
            Thread.sleep(500);
            flag[0] = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("flag = " + flag);
    }
}
