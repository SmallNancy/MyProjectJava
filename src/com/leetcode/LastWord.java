package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 16:39
 */
public class LastWord {
    public static void main(String[] args) {
        String  s= "hello world";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
       int len = s.length() - 1;
       int count = 0;
       for (int i = len;i >= 0;i--) {
           if (s.charAt(i) != ' ') {
               count++;
           }else if (s.charAt(i) == ' ') {
               break;
           }
       }
       return count;

    }
}
