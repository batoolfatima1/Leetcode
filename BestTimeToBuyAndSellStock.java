import java.util.*;
public class BestTimeToBuyAndSellStock
 {
    public static void main(String[] args)
     {
        int[] arr = {7,6,4,3,1};
   
        //int[] copy = arr;
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }
        List<Integer> newList = new ArrayList<>(intList);
        ArrayList<Integer> transactions = new ArrayList<>();
        System.out.println(transactions.size());

        while(!intList.isEmpty())
        {
            intList.sort(Comparator.naturalOrder());
            System.out.println("index " + intList.get(0));
            int min = intList.get(0); // get minimum value
            intList.remove(0);
            //System.out.println("removed " + intList.get(0));
            int minIndex = -1;

           // System.out.println("newlist size : "+ newList.size());

            for(int i=0 ; i<newList.size(); i++)
            {
                if(min == newList.get(i))
                {
                    minIndex = i;
                    break;
                }
            }
            System.out.println("index of min "+ minIndex);

            int max = min;

            for(int j =minIndex; j <newList.size(); j++)
            {
                max= Math.max(newList.get(j), max);
            }
            
            System.out.println("min and max " + min + " "+ max);

            if(min != max)
            {
                System.out.println("transaction is done : "+ (max-min));
                transactions.add(max-min);
                System.out.println("add");
            }
        }

        if(transactions.size() != 0)
        {
            transactions.sort(Comparator.reverseOrder());
            System.out.println( "transaction : "+transactions.get(0));
        }
        else
        {
            System.out.println( "zero transaction : 0");
        }    
        
        
    }   
}
