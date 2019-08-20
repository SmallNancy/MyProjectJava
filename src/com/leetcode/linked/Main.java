package com.leetcode.linked;


/**
 * @author YanQiKing
 * @date 2019/8/19 16:34
 */
public class Main {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return null;
       ListNode p1 = head;
       ListNode p2 = head;
       boolean isCircle = false;
       while (p2.next != null && p2.next.next != null) { //判断是否有环
           p1 = p1.next;
           p2 = p2.next.next;
           if (p1 == p2){
               isCircle = true;
               break;
           }
       }

       if (isCircle) {         //找到出现环的位置
           ListNode q = head;
           while (q != p2) {
               p2 = p2.next;
               q = q.next;
           }
           return q;
       }

       return null;

    }
}
