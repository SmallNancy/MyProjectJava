package com.sgg.day_01;

/**
 * @author YanQiKing
 * @date 2019/6/13 20:23
 */
public class Demo_Arithmetic {
    public static void main(String[] args) {
        // 只看被取模数的符号
        int a1 = -12 % 5;
        int a2 = 12 % 5;
        int a3 = -12 % -5;
        System.out.println("-12 % 5 = " + a1);
        System.out.println("-12 % 5 = " + a2);
        System.out.println("-12 % 5 = " + a3);
    }
}
