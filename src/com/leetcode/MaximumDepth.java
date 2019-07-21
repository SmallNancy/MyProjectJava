package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 20:53
 */
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;

    }
    public int TreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
