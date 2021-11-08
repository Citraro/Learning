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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null){
            return head;
        }
        
        int nodeCount = countOfNodes(head);
        
        if(nodeCount < k){
            return head;
        }
        
        ListNode current = head;
        ListNode previous = null;
        
        int iterations = 0;
    
        while(current != null && iterations < k){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            iterations++;
        }
        
        head.next = reverseKGroup(current,k);
        
        return previous;
    }
    
    public int countOfNodes(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }
}
