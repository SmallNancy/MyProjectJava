package com.onlineCode;
import java.util.Stack;

/**
 * @author YanQiKing
 * @date 2019/7/14 15:11
 *
 *两个栈实现一个队列的操作
 */
public class Demo05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
              stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }
}
