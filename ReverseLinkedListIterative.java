public class ReverseLinkedListIterative {
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
        // recursive method
        // corner cases -> if list is null or if list has only 1 element then reversing would return the same
        if(head == null || head.next == null )
        {
            return head;
        }
        
        // // i assume that i got reversed list from elements above my position

        // ListNode newHead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newHead;


        // iterative method

        ListNode previous = head;
        ListNode current = head.next;

        while(current!= null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous= current;
            current = next;
        }
        head.next=null;
        head = previous;
        return head;
    }
}
