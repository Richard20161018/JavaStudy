package jvm.day0814;

/**
 * @author wangchengdong
 * @date 2019/8/14
 * @desc
 */
public class Test01 {

    //测试 Minor GC

    /**
     * VM参数 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        final int _1MB = 1024 * 1024;
        byte[]allocation1,allocation2,allocation3,allocation4,allocation5,allocation6;
        allocation1=new byte[2*_1MB];
        allocation2=new byte[2*_1MB];
        allocation3=new byte[2*_1MB];
        allocation4=new byte[4*_1MB];//出现一次Minor GC
        allocation5=new byte[4*_1MB];
        allocation5=null;
        System.gc();
        allocation6=new byte[2*_1MB];
    }
}
