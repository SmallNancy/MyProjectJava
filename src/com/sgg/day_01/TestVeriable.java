package com.sgg.day_01;

/**
 * 自动类型转换
 */

public class TestVeriable {
    public static void main(String[] args) {
        // 自动类型转换 byte,short==>int==>long==>float==>double
        short s = 12;
        int a = 34;
        System.out.println(a+s);
        long l = 12L;
        float f = l;
        System.out.println(f == l);

        //注意：short,byte,char之间做运算转换成int short 和 short也转换成int,自增自减、+=、-+类型不变
        short ss = 12;
        short bb = 1;
        ss += 2;
        System.out.println(ss+bb);

        long l1 = 12345L;
        byte bbb = (byte)l1;
        System.out.println(bbb);
        String str1 = "hello";
        int my = 12;
        System.out.println(str1+12+13);


    }
}
