public class MergeTwoLinkedLists {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
         
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
             return list2;
        }
            
        if(list2 == null)
        {
            return list1;
        }

        ListNode output = new ListNode(0);
        ListNode head;
        // if(list1.val > list2.val) {
        //   output = head = new ListNode(list2.val);
        //   list2 = list2.next;
        //  }
        //  else
        //  {
        //   output = head = new ListNode(list1.val);
        //   list1 = list1.next;
        //  }
        head = output;

        while(list1 != null && list2 != null)
        {
                if(list1.val <= list2.val)
                {
                    output.next = new ListNode(list1.val);
                    list1=list1.next;
                    output = output.next;
                }
                else
                {
                    output.next = new ListNode(list2.val);
                    list2 = list2.next;
                    output = output.next;
                }
        }

        // while(list1 != null || list2 != null)
        // {
        //     if(list1 != null && list2 == null) // or list2 is finished
        //     {
        //         output.next = new ListNode(list1.val);
        //         list1= list1.next;
        //         output = output.next;
        //     } 
        //     else if(list2  != null && list1 == null)
        //     {
        //         output.next = new ListNode(list2.val);
        //         list2 = list2.next;
        //         output = output.next;
        //     } 
        //     else
        //     {
        //         if(list1.val <= list2.val)
        //         {
        //             output.next = new ListNode(list1.val);
        //             list1=list1.next;
        //             output = output.next;
        //         }
        //         else
        //         {
        //             output.next = new ListNode(list2.val);
        //             list2 = list2.next;
        //             output = output.next;
        //         }
        //     }            
        // }

        while(list1 != null) // or list2 is finished
        {
            output.next = new ListNode(list1.val);
            list1= list1.next;
            output = output.next;
        } 

        while(list2 != null)
        {
            output.next = new ListNode(list2.val);
            list2 = list2.next;
            output = output.next;
        } 

        return head.next;  
    }
}
