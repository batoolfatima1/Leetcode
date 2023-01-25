import java.util.*;
public class PascalsTriangle {


    // time limit exceed for rows= 29 for this algo
    public static int pascal(int i, int j)
    {
       // List<Integer> l = new ArrayList<Integer>();
        if(i==0 || i==j || j==0)
        {
           //l.add(1);
           return 1;
        }
        else
        {
            return pascal(i-1,j-1)+pascal(i-1,j); 
        } 
    }
    public static void main(String[] args) {
        int numRows = 29;

        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++)
        {
            List<Integer> l = new ArrayList<Integer>();
            for(int j=0; j<= i; j++)
            {
               l.add(pascal(i, j));
            }
            output.add(l);
        }

        for(List<Integer> i : output)
        {
            System.out.println(i);
        }
    }
}
