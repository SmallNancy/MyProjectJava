package com.sgg.day_02;

/**
 * @author YanQiKing
 * @date 2019/6/14 11:40
 * 1-100质数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag = false;
        long start = System.currentTimeMillis();
        for (int i = 2;i <= 100000;i++) {
            for (int j = 2;j <= Math.sqrt(i);j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag==false){
                System.out.println(i);
            }
            flag = false;
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("时间："+(end-start)) ;
    }
}
