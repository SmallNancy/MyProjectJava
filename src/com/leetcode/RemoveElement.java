package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 15:23
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length;j++) {
            if (val != nums[j]) {
                nums[i++] = nums[j];
            }
        }
        return i;

    }
    public int strStr(String haystack, String needle) {
        if(haystack.length() - needle.length() < 0)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length();i++) {
            if (haystack.substring(i,i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}
