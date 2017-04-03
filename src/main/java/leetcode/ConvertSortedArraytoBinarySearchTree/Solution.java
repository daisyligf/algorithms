package leetcode.ConvertSortedArraytoBinarySearchTree;

/**
 * Created by daisyli on 2017/4/2.
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class Solution {

    private TreeNode buildTree(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(num[middle]);
        node.left = buildTree(num, start, middle - 1);
        node.right = buildTree(num, middle + 1, end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] num) {
        if (num == null) {
            return null;
        }
        return buildTree(num, 0, num.length - 1);
    }
}
