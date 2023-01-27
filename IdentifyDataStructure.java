import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;
public class IdentifyDataStructure {
   public static void main(String[] args) {
    try
    {
        File file = new File("input.txt");
        Scanner pointer = new Scanner(file);

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        int loc = Integer.parseInt(pointer.nextLine());

        Boolean stack_flag = true;
        Boolean queue_flag = true;
        Boolean pqueue_flag = true;

        for(int i=1 ; i <= loc ; i++)     
        {
            String msg = pointer.nextLine();
            String[] part = msg.split(" ");
            String operation = part[0];
            int val = Integer.parseInt(part[1]);
            if(operation.equalsIgnoreCase("push"))
            {
                stack.push(val);
                queue.add(val);
                pQueue.add(val);
            }
            else 
            {
                System.out.println("stack ->" + stack.peek()+ " "+ val);
                if(stack.pop() != val)
                {
                   // not stack
                   System.out.println("went inside stack");
                   stack_flag = false;
                }
                //stack.pop();
                System.out.println("queue ->"+ queue.peek() + " "+ val);
                if(queue.remove() != val)
                {
                    System.out.println("went inside queue");
                   queue_flag = false;
                }
               // queue.remove();
                System.out.println("pqueue->"+ pQueue.peek()+ " "+ val);
                if(pQueue.poll() !=val)
                {
                    // flag = true
                    System.out.println("went inside oqueue");
                    pqueue_flag = false;
                }
                //pQueue.remove();
                // else
                // {
                //     System.out.println("impossible");
                // }
            }
        }
        if(stack_flag == true && queue_flag == false && pqueue_flag == false)
        {
            System.out.println("LIFO");
        }
        else if (stack_flag == false && queue_flag == true && pqueue_flag == false)
        {
            System.out.println("FIFO");
        }
        else if (stack_flag == false && queue_flag == false && pqueue_flag == true)
        {
            System.out.println("PQ");
        }
        else if (stack_flag == false && queue_flag == false && pqueue_flag == false)
        {
            System.out.println("impossible");
        }
        else
        {
            System.out.println("not sure");
        }
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
   } 
}
