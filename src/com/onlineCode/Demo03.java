package com.onlineCode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author YanQiKing
 * @date 2019/7/14 11:17
 * 反转链表
 */
public class Demo03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
