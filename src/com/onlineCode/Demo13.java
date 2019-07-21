package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 17:44
 * 反转链表
 */
public class Demo13 {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        //ListNode temp = head;
        ListNode newNode = head;
        ListNode prior = null;
        while (newNode.next != null) {
            ListNode n = newNode.next;
            newNode.next = prior;
            prior = newNode;
            newNode = n;
        }
        newNode.next = prior;
        return newNode;

    }
}
