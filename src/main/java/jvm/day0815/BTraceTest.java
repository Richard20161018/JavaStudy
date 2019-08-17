package jvm.day0815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wangchengdong
 * @date 2019/8/15
 * @desc
 */
public class BTraceTest {

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        BTraceTest bTraceTest = new BTraceTest();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            bufferedReader.readLine();
            int a = (int) (Math.random()*100);
            int b = (int) (Math.random()*100);
            System.out.println(bTraceTest.add(a,b));
        }

    }
}
