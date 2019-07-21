package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 10:44
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println( isPalindrome(1001));
    }
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            if((long)res * 10 > Integer.MAX_VALUE || (long)res * 10 < Integer.MIN_VALUE) {
                return 0;
            }
            res = (res * 10) + x % 10;
            x /= 10;
        }
        return (int)res;
    }
    public static boolean isPalindrome(int x) {
      if (x < 0) return false;
      int div = 1;
      while (x / div >= 10) div *= 10;
      while (x > 0) {
          int left = x / div;
          int right = x % 10;
          if (left != right) return false;
          x = (x % div) / 10;
          div /= 100;
      }
      return true;

    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
