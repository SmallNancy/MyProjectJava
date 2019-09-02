package SwordOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 利用一个栈实现
 * @author YanQiKing
 * @date 2019/9/1 15:28
 */
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
