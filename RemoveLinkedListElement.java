// 1->2->6->7->6->0  val = 6
//=
// 1->2->7->0

// 6->6->6->6 val =6
//=
// []


public class RemoveLinkedListElement {

            public class ListNode {
            int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
             }
        public ListNode removeElements(ListNode head, int val)
        {
           ListNode output = new ListNode(0); // list node with val=0
    
           output.next = head;
    
           ListNode dummy = output; // we'll make changes in this dummy so they eventually get stored in our output
    
           while(dummy.next != null)
           {
               if(dummy.next.val == val)
               {
                   ListNode x = dummy.next; // x is getting that node whose value is matched
                   dummy.next = x.next; // what id dummy = x.next ?? went wrong for those where next value is also matching
               }
               else
               {
                   dummy = dummy.next;
               }
           } 
     
        return output.next; // .next is used to omit the starting 0 we used for initialization
        }


        // public static void main(String[] args) {
        //    ListNode l = new ListNode();
        //    l = insert(l,1);

        // }
}
