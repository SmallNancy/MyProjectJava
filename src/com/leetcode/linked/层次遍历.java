package com.leetcode.linked;

import com.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author YanQiKing
 * @date 2019/8/21 8:07
 * 二叉树等词遍历
 */
public class 层次遍历 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        levelTraversal(root);

    }
    public static void levelTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);                  // offer向队列中添加元素
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();   // poll删除对头元素
            System.out.println(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
