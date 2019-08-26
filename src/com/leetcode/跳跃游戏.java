package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/8/26 8:56
 */
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        int digist = 0; // 下标值
        for (int i = 0; i < nums.length && i <= digist ;i++) {
            digist = Math.max(digist,nums[i]+i);
        }
        return digist >= nums.length - 1;

    }
}
