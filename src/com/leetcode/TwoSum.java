package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YanQiKing
 * @date 2019/7/20 15:19
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length <= 1)
            return res;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++) {
            int num = nums[i];
            int val = target - num;
            if (map.containsKey(val)) {
                res[0] = i;
                res[1] = map.get(val);
                return res;
            }else map.put(num,i);
        }
        return res;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int  sum = l1.val + l2.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(val);
            current.next = newNode;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            current.next = new ListNode(val);
            current = current.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            current.next = new ListNode(val);
            current = current.next;
            l2 = l2.next;
        }
        if (carry == 1) current.next = new ListNode(carry);
        return temp.next;

    }
}
