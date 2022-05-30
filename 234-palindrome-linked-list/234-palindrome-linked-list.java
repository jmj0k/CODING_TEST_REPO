/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode left = null;
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        left = head;
        return check(head);
    }
    private boolean check(ListNode right) {
        if (right == null) return true;
        if (!check(right.next)) return false;
        boolean result = (left.val == right.val);
        left = left.next;
        return result;
    }
}