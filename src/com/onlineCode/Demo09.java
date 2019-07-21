package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 16:13
 * 补码：原码取反+1
 */
public class Demo09 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(NumberOf1(n));

    }
    public static int NumberOf1(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n = (n-1) & n;
        }
        return num;

    }
}
