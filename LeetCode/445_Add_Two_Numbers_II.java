class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<ListNode> a = new Stack<>();
        Stack<ListNode> b = new Stack<>();
        Stack<ListNode> c = new Stack<>();
        
        int carry = 0;
        ListNode result = null, prev = null;
        
        while(l1!=null){
            a.push(l1);
            l1 = l1.next;
        }
        
        while(l2!=null){
            b.push(l2);
            l2 = l2.next;
        }
        
        while((!a.isEmpty()) || (!b.isEmpty())){
            int sum = ((a.isEmpty()) ? 0 : a.pop().val)+(b.isEmpty() ? 0 : b.pop().val) + carry;
            
            carry = sum / 10;
            if(sum > 9){
                sum %= 10;
            }
            ListNode node = new ListNode(sum);
            c.push(node);
        }
        
        if(carry > 0){
            ListNode node = new ListNode(carry);
            c.push(node);
        }
        
        while(!c.empty()){
            ListNode node = c.pop();
            if(result == null){
                result = node;
                prev = result;
            }else{
                prev.next = node;
                prev=node;
            }
        }
        
        prev.next = null;
        
        return result;
        
    }
}
