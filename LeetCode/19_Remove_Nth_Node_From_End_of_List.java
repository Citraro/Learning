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
        
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head;
        
        int headStart = n;
        
        while(first != null){
            if(headStart > 0){
                first = first.next;
                headStart--;
            }else{
                prev = second;
                second = second.next;
                first = first.next;
            }
        }
        
        if(prev == null) return head.next;
        
        prev.next = second.next;
        
        return head;
        
    }
}
