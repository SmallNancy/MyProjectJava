package SwordOffer;

import java.util.Stack;

/**
 *
 * 使用栈进行非递归遍历
 * @author YanQiKing
 * @date 2019/9/1 16:16
 */
public class 非递归遍历二叉树 {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(4);
        head.left = new TreeNode(3);
        head.right = new TreeNode(2);
        head.left.left = new TreeNode(5);
        preOrdreUnRecur(head);
        inOrderUnRecur(head);
    }
    /**
     * 先序遍历
     * @param head
     */
    public static void preOrdreUnRecur(TreeNode head) {
        System.out.print("先序遍历：");
        if (head == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(head);
        while (!stack.isEmpty()) {
            head = stack.pop();
            System.out.print(head.val + " ");
            if (head.right != null) {
                stack.add(head.right);
            }
            if (head.left != null) {
                stack.add(head.left);
            }
        }
        System.out.println();
    }

    /**
     * 中序遍历
     * head != null 把head加入到stack，head = head.next;
     * head == null stack中弹出并打印， head = head.right;
     * @param head
     */
    public static void inOrderUnRecur(TreeNode head) {
        System.out.print("中序遍历：");
        if (head == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while (head != null || !stack.isEmpty()) {
            if (head != null) {
                stack.add(head);
                head = head.left;
            }else {
                head = stack.pop();
                System.out.print(head.val + " ");
                head = head.right;
            }
        }
        System.out.println();
    }
}
