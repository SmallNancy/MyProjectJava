package com.sgg.day_01;

public class Demo_Test {
    public static void main(String[] args) {
        int b1 = 12;
        long lon = 122345L;

        // float double
        float f = 12.3F;
        double d = 12.3;
        System.out.println(f == d);

        // char 只能表示一个字符,包括中文、英文、转译字符
        char c = 'a';
        char c2 = '中';
        char c3 = '\t';
        char c4 = '\u1235';
        System.out.println(c4);

        //boolean 不能取 null
        Pu p = new Pu();
        System.out.println(p.f);

    }
}
class Pu{
    boolean f;  // 默认false
}
