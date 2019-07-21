package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YanQiKing
 * @date 2019/7/21 17:25
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int s1 = 1;
        int s2 = 2;
        for (int i =3;i <= n;i++) {
            s2 = s1 + s2;
            s1 = s2 - s1;
        }
        return s2;

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode(0);
        list.next = head;
        while (head != null) {
            while (head.next != null && head.next.val == head.val) {
                head = head.next.next;
            }
            head = head.next;
        }
        return list.next;

    }
}
