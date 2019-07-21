package com.leetcode;

import java.util.ArrayList;

/**
 * @author YanQiKing
 * @date 2019/7/21 20:31
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;   // 先判断节点是否存在
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }
}
