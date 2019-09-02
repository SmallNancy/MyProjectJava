package SwordOffer;

/**
 * @author YanQiKing
 * @date 2019/9/1 15:51
 */
public class 递归遍历二叉树 {

    /**
     * 前序遍历
     * @param head
     */
    public static void preOrderRecur(TreeNode head) {
        if (head == null)
            return;
        System.out.println(head.val + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    /**
     * 中序遍历
     * @param head
     */
    public static void  inOrderRecur(TreeNode head) {
        if (head == null)
            return;
        inOrderRecur(head.left);
        System.out.println(head.val + " ");
        inOrderRecur(head.right);
    }

    /**
     * 后续遍历
     * @param head
     */
    public static void backOrderRecur(TreeNode head) {
        if (head == null)
            return;
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.val + " ");
    }
}
