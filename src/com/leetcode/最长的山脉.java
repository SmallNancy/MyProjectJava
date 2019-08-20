package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/8/20 8:37
 * leetcode 845 数组中最长的山脉
 */
public class 最长的山脉 {
    //TODO:分别记录i位置前面的个数和i位置后面符合条件的个数
    public int longestMountain(int[] A) {
        int i = 1;
        int res = 0;
        while (i < A.length) {
            while (i < A.length && A[i - 1] == A[i])
                i++;
            int priorNum = 0;
            int backNum = 0;
            while (i < A.length && A[i - 1] < A[i]) {
                priorNum++;
                i++;
            }
            while (i < A.length && A[i - 1] > A[i]) {
                backNum++;
                i++;
            }
            if (priorNum > 0 && backNum > 0) {
                res = Math.max(res,priorNum + backNum + 1);
            }
        }
        return res;
    }
}
