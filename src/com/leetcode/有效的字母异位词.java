package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/8/24 9:41
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        System.out.println(isAnagram(s,t));
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            arr[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i) - 'a';
            arr[c]--;
        }
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
