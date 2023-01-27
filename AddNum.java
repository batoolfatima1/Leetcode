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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
    ListNode dummy = new ListNode(0);
    ListNode result = dummy;
    int carry =0;
     while(l1 != null || l2 != null)
     {
        int val1 = (l1!=null)? l1.val:0;
        int val2 = (l2!=null)? l2.val:0;

        int current_sum = val1 + val2 +carry;
        carry = current_sum/10;
        int current_node_value = current_sum%10;

        ListNode temp = new ListNode(current_node_value);
        result.next = temp;

         //result.value= current_node_value;

         if(l1!=null)l1=l1.next;
         if(l2!=null)l2=l2.next;
         result= result.next;
     }
     if(carry>0)
     {
         ListNode last = new ListNode(carry);
         result.next = last;
     }
     return dummy.next;   
    }
}