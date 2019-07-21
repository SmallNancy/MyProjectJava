package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 16:34
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< nums.length;i++) {
            int sum = 0;
            for (int j = i; j < nums.length;j++) {
                sum += nums[j];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;

    }
}
