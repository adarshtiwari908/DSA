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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;
        
        // Move right pointer n steps ahead
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        
        // Move both pointers until right reaches the end
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        
        // Remove the nth node from the end
        left.next = left.next.next;
        
        return dummy.next;
    }
}