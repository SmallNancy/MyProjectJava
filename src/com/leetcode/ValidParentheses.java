package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author YanQiKing
 * @date 2019/7/21 11:48
 * 有效的括号
 * 栈
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0 ; i < s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            }else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.getLast() == '(' && s.charAt(i) != ')'){
                        return false;
                    }
                    if (stack.getLast() == '{' && s.charAt(i) != '}'){
                        return false;
                    }
                    if (stack.getLast() == '[' && s.charAt(i) != ']'){
                        return false;
                    }
                    stack.removeLast();
                }
            }
        }
        return stack.isEmpty();
    }
}
