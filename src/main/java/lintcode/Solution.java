package lintcode;

/**
 * Created by daisyli on 2017/4/2.
 * 二叉树的最大节点
 *
 */
public class Solution {
    TreeNode max;
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (max == null || root.val > max.val) {
            max = root;
        }
        maxNode(root.left);
        maxNode(root.right);
        return max;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
