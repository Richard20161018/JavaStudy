package jvm.day0814;

/**
 * @author wangchengdong
 * @date 2019/8/14
 * @desc
 */
public class Test02 {

    /**
     * VM参数：-verbose:gc-Xms20M-Xmx20M-Xmn10M-XX:+PrintGCDetails-XX:SurvivorRatio=8-XX:MaxTenuringThreshold=15
     * -XX:+PrintTenuringDistribution
     */

    public static void main(String[] args) {
        testTenuringThreshold2();
    }
    public static void testTenuringThreshold2() {
        final int _1MB = 1024 * 1024;

        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        //allocation1+allocation2大于survivo空间一半
//        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }

}
