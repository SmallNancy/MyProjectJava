package com.sgg.day_01;

import java.util.Scanner;

/**
 * @author YanQiKing
 * @date 2019/6/13 21:19
 */
public class TestLogic {
    public static void main(String[] args) {
        int a1 = 10;
        if (false & (a1++) > 0) {
            System.out.println("全为true");
        }else {
            System.out.println("false");
        }
        System.out.println(a1);

        int a2 = 10;
        if (false && (a2++) > 0) {
            System.out.println("全为true");
        }else {
            System.out.println("false");
        }

        System.out.println(a2);
        System.out.println("==========");
        System.out.println(~12);
        System.out.println("==========");
        int a = 12;
        int b = 15;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "  " + b);

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);


    }
}
