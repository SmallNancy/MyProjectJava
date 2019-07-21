package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 20:42
 * 镜像二叉树
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return test(root.left,root.right);

    }
    /**
     *左右孩子进行比较
     * 1、确定左右孩子是否都存在
     * 2、比较左孩子和有孩子的值是否相等
     */
    public boolean test(TreeNode left,TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return test(left.left,right.right) &&test(left.right,right.left);
    }
}
