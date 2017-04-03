package leetcode.BalancedBinaryTree;

import apple.laf.JRSUIUtils;

/**
 * Created by daisyli on 2017/4/2.
 * Given a binary tree, determined if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of
 * every node never differ by more than 1.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight - rightHeight >= -1 && leftHeight - rightHeight <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }

        return false;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return height(root.right) + 1;
        }

        if (root.right == null) {
            return height(root.left) + 1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
}
