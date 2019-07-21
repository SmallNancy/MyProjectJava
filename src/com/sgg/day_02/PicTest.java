package com.sgg.day_02;

/**
 * @author YanQiKing
 * @date 2019/6/14 11:29
 * ----*
 * ---* *
 * --* * *
 * -* * * *
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 */
public class PicTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++) {
            for (int k =0;k < 4-i;k++) {
                System.out.print("-");
            }
            for (int j = 0; j < i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int m = 0; m < 4;m++) {
            for (int j = 0; j < m+1;j++) {
                System.out.print(" ");
            }
            for (int k =0;k < 4-m;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
