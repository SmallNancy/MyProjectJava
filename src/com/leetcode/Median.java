package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 21:42
 * 找两个数组的中位数
 */
public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = nums2.length - 1;
        while (i < j) {
            i++;
            j--;
        }
        if (i == j)
            return nums1[i];
        else
            return (double)(nums1[i]+nums2[j])/2;

    }
}
