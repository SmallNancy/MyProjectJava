package com.leetcode;

import java.util.Map;

/**
 * @author YanQiKing
 * @date 2019/7/20 16:07
 * 最长的不同的连续的子串  设置boolean标志位，左右位置
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int left = 0;
        int right = 0;
        int len = s.length();
        boolean[] flag = new boolean[128]; // 默认false
        int max = 0; // 存储结果
        while (right < len) {
            if (flag[s.charAt(right)] != true) {
                flag[s.charAt(right)] = true;
                right++;
            }else {
                max = Math.max(max,right - left);
                while (left < right && s.charAt(left) != s.charAt(right)) {
                    flag[s.charAt(left)] = false;
                    left++;
                }
                left++;right++;
            }
        }
        max = Math.max(max,right - left);
        return max;

    }
}
