package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 14:29
 */
public class MergeLink {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(l1,l2));

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merge = new ListNode(0);
        ListNode temp = merge;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                merge.next = l1;
                l1 = l1.next;
            }else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }
        merge.next = l1 != null ?l1:l2;
        return temp.next;
    }
}
