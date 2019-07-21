package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/20 15:56
 */
public class SumList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0:l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            head.next = cur;
            head = head.next;
            l1 = (l1 == null) ? l1 :l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return temp.next;

    }
}
