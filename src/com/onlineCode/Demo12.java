package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 17:36
 *
 * 链表倒数第k个  先遍历计数，再查找结束
 */
public class Demo12 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null)
            return null;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (k > count)
            return null;
        ListNode t = head;
        for (int i = 0; i < count - k;i++) {
            t = t.next;
        }
        return t;
    }
}
