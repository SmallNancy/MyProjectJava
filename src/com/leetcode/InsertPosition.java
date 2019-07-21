package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 15:37
 */
public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i<nums.length;i++) {
            if (target == nums[i])
                return i;
            if (target < nums[i])
                return i;
        }
        return nums.length;

    }
}
