package jvm.day0814;

public class Bar {

    int a = 1;
    final int b = 2;
    public int sum(int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        new Bar().sum(3);
    }
}
