/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visited = new HashSet<>();

        ListNode current = headA;
        while(current != null){
            visited.add(current);
            current=current.next;
        }

        current = headB;
        while(current != null){
            if(visited.contains(current)){
                return current;
            }
            current= current.next;
        }
        return null;
    }
}