package juc;

/**
 * @author wangchengdong
 * @date 2019/8/6
 * @desc
 */
public class Day08062 {
    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        new Thread(td).start();
        while (true) {
            if (td.isFlag()) {
                System.out.println("-----------------------------");
                break;
            }
        }
    }
}


class ThreadDemo3 implements Runnable{


    private volatile boolean flag = false;

    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag="+flag);
    }

    public boolean isFlag(){
        return flag;
    }
}
