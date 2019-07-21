package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 15:21
 */
public class Demo06 {
    public int minNumberInRotateArray(int [] array) {
        for (int i = 0;i < array.length - 1;i++) {
            if (array[i] > array[i+1])
                return array[i+1];
        }
        return array[0];

    }
}
