package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 16:53
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = digits.length - 1; i >=0;i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }else {
                digits[i]=0;
            }
        }

        int[] res = new int[n+1];
        res[0] = 1;
        return res;

    }
}
