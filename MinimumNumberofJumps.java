
// N = 6
// arr = {1, 4, 3, 2, 6, 7}
// Output: 2 

public class MinimumNumberofJumps {
    public static void main(String[] args)
    {
        int a[] = {1, 4, 3, 2, 6, 7};
        //int a[] ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int length = a.length;
        
        int count = jumpsCount(a, length);
        System.out.println(count);
    }

    public static int jumpsCount(int a[], int length)
    {
        int i=0;
        int jumps =-1;
        while(i <length-1)
        {
            int value = a[i];
            System.out.println("i = "+ i);
            System.out.println(a[i]);
            i= i+value;
            jumps += 1;
        }
        if(i < length-1)
            return -1;
        else if( i == length-1)
            return jumps;
        else
            return jumps+1;
    }
}
