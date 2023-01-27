public class ReverseLinkedListRecursive {

    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        
    }
    public ListNode reverseList(ListNode head)
    {
      // corner cases -> if list is null or if list has only 1 element then reversing would return the same
        if(head == null ||head.next == null )
        {
            return head;
        }
        // recursive method
        // i assume that i got reversed list from elements above my position

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
