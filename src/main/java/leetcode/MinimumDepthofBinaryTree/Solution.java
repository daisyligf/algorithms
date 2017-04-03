package leetcode.MinimumDepthofBinaryTree;

/**
 * Created by daisyli on 2017/4/3.
 * Given a binary tree,find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 && right == 0) {
            return 1;
        }
        if (left == 0) {
            left = Integer.MAX_VALUE;
        }
        if (right == 0) {
            right = Integer.MAX_VALUE;
        }
        return Math.min(left, right) + 1;
    }
}
