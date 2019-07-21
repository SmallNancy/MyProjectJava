package com.sgg.day_03;

/**
 * @author YanQiKing
 * @date 2019/6/15 12:24
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        System.out.println();
        for (int i = 0;i < arr.length - 1;i++) {
            for (int j = 0; j<arr.length - i - 1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
