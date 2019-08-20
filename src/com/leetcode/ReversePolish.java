package com.leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author YanQiKing
 * @date 2019/8/20 8:17
 * leetcode 150 逆波兰表达式求值
 */
public class ReversePolish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] tokens = s.split(" ");
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length;i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                if (tokens[i].equals("+") ) {
                   stack.add(a+b);
                }else if (tokens[i].equals("-") ){
                    stack.add(b - a);
                }else if (tokens[i].equals("*")) {
                    stack.add(b * a);
                }else {
                    stack.add(b /a);
                }
            }else {
                stack.add(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }
}
