package leetcode.ReverseLinkedList;

/**
 * Created by daisyli on 2017/4/3.
 * Reverse a singly linked list.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        if (head.next == null) {
            return head;
        }

        ListNode p = head.next;
        ListNode n = reverseList(p);

        head.next = null;
        p.next = head;
        return n;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
