package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 14:21
 */
public class Demo04 {
    public static void main(String[] args) {
//        int[] pre = {1,2,4,3,5,6};
//        int[] in = {4,2,1,5,3,6};
//        reConstructBinaryTree(pre,in);

    }
    public  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int pLen = pre.length;
        int iLen = in.length;
        if (pLen == 0 && iLen == 0)
            return null;
        return process(pre,in,0,pLen - 1,0,iLen - 1);

    }
    public  TreeNode process(int[] pre,int[] in,int pStart,int pEnd,int iStart,int iEnd) {
        TreeNode tree = new TreeNode(pre[pStart]); // 先序遍历第一个为根节点
        tree.left = null;
        tree.right = null;
        if (pStart == pEnd && iStart == iEnd) {
            return tree;
        }

        // 找到根节点
        int root = 0;
        for (root= iStart;root<iEnd;root++) {  //
            if (pre[pStart] == in[root]) {
                break;
            }
        }

        // 划分左右子树
        int leftLen = root - iStart; // 左子树长度
        int rightLen = iEnd - root;  //右子树长度
        if (leftLen > 0) {
            tree.left = process(pre,in,pStart+1,pStart+leftLen,iStart,root-1);
        }
        if (rightLen > 0) {
            tree.right = process(pre,in,pStart+leftLen+1,pEnd,root+1,iEnd);
        }
        return tree;
    }
}
