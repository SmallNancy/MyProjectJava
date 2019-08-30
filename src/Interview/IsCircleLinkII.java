package Interview;


/**
 * 求出是否有环，如果有返回入环头节点
 * @author YanQiKing
 * @date 2019/8/30 20:15
 */
public class IsCircleLinkII {
    public boolean isPowerOf2(int num) {
        return (num & num - 1) == 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p1 = head;
                while (p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}
