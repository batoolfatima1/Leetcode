public class CycleInLinkedList {
 class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }

         
     }
    public boolean hasCycle(ListNode head)
    {
       
        // brute force solution
        // it will work only if list has unique elements

        // HashSet<Integer> set = new HashSet<>();

        // while(head != null)
        // {
        //     if(set.contains(head.val))
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //         set.add(head.val);
        //         head = head.next;
        //     }

        // }
        // return false;


        // two pointers approach

        // if there is a  loop two pointers must meet each other

        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast)
        {
            if(fast == null || fast.next == null)
            {
                return false;
            }
            slow = slow.next;
            fast= fast.next.next;
        }
        return true;

    }
}
