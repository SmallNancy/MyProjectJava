package Interview;


/**
 * 1、判断链表是否有环
 * @author YanQiKing
 * @date 2019/8/30 17:00
 */
public class IsCircleLink {
    public static void main(String[] args) {
       ListNode n1 = new ListNode(5);
       ListNode n2 = new ListNode(3);
       ListNode n3 = new ListNode(7);
       ListNode n4 = new ListNode(2);
       ListNode n5 = new ListNode(6);
       n1.next = n2;
       n2.next = n3;
       n3.next = n4;
       n4.next = n5;
       n5.next = n3;

        System.out.println(isCircle(n1));
    }
    public static boolean isCircle(ListNode list) {
        ListNode p1 = list;
        ListNode  p2 = list;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1== p2) {
                return true;
            }
        }
        return false;
    }

}
