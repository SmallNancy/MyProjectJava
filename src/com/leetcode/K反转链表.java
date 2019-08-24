package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/8/24 10:08
 */
public class K反转链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(reverseKGroup(head,2));
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode cur = head,prev = null;
        while (cur != null && count < k) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if (count == k) {
            head.next = reverseKGroup(cur,k);
        }else if (count < k && count > 0 ) {
            return reverseKGroup(prev,count);
        }
        return prev;
    }
}
