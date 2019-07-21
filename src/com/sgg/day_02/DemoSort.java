package com.sgg.day_02;


/**
 * @author YanQiKing
 * @date 2019/6/14 10:07
 * 水仙花数 153 = 1*1*1+5*5*5+3*3*3
 */
public class DemoSort {
    public static void main(String[] args) {
        /*int i = 1;
        for (System.out.print("a");i < 3;System.out.print("b"),i++) {
            System.out.print("Z"); //aZbZb
        }*/

        for (int i =1;i <=100;i++) {
            if (i %2==0) {
                System.out.print(i+" ");
            }
        }

        System.out.println();
        for (int i = 100;i < 1000;i++) {
            int v1 = i /100;
            int v2 = (i - v1 * 100)/10;
            int v3 = i % 10;
            if (i == v1*v1*v1+v2*v2*v2+v3*v3*v3){
                System.out.println(i);
            }
        }
    }
}
