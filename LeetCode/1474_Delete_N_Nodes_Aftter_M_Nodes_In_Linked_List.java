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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode previous = null;
        
        while(current != null){
            int i = m;
            int j = n;
            
            while(current != null && i > 0){
                previous = current;
                current = current.next;
                i--;
            }
            while(current != null && j > 0){
                current = current.next;
                j--;
            }
            previous.next = current;
        }
        
        return head;
    }
}
