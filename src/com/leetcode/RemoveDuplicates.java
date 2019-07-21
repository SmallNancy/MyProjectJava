package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 14:59
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int num = 0;  // 记录不重复的个数
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != nums[num]) {
                num++;
                nums[num] = nums[i];
            }
        }
        num+=1;
        return num;

    }
}
