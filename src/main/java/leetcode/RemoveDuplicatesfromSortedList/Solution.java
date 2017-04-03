package leetcode.RemoveDuplicatesfromSortedList;

/**
 * Created by daisyli on 2017/4/3.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        while(node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Solution s = new Solution();
        s.deleteDuplicates(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
