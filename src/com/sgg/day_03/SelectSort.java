package com.sgg.day_03;

/**
 * @author YanQiKing
 * @date 2019/6/15 12:31
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        for (int i = 0;i < arr.length -1;i++) {
            int t = i;
            for (int j = i;j < arr.length;j++) {
                if (arr[j] < arr[t]) {
                    t = j;
                }
            }
            if (t != i) {
                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;
            }
        }
        System.out.println();

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
