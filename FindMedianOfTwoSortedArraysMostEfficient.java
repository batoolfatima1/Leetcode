// O(log(n+m)) Solution
public class FindMedianOfTwoSortedArraysMostEfficient
{
public static void main(String[] args) 
{
     //nums1 = [1,2,3,4,5,6]
    //nums2 = [6,7,8,9,10]

    // nums1+nums2 =[1,2,3,4,5,6,6,7,8,9,10]
    // median = 6

    int nums1[] = {1,3,4,5};
    int nums2[] = {2} ; 

    // nums2 should be smaller than nums1 else swap

    if(nums1.length < nums2.length)
    {
        int temp[] = nums1;
        nums1 = nums2;
        nums2 = temp;
    }

    int size1 = nums1.length;
    int size2 = nums2.length;

    int totalSize = size1+size2; //7
    System.out.println(totalSize);
    int half = totalSize/2; //3
    System.out.println(half);

    // elements should be selected from num2

    int l = 0;
    int r = size2-1;
    

    while(true)
    {
    
         int i = (l+r)/2;      // last index of nums1 as lefthalf  //1
         System.out.println("i = "+ i);
         int j = half - i -2;  // last index of nums2 as lefthalf
         System.out.println("j = "+ j);
    

         double nums2Left  = (i>=0) ? nums2[i]:Double.NEGATIVE_INFINITY;
         System.out.println("nums2Left = "+nums2Left  );
         double nums2Right = (i+1 < nums2.length)? nums2[i+1]: Double.POSITIVE_INFINITY  ;
         System.out.println("nums2Right = "+nums2Right);
         double nums1Left  = (j>=0) ? nums1[j]:Double.NEGATIVE_INFINITY ;
         System.out.println("nums1left =  "+nums1Left);
         double nums1Right = (j+1 < nums1.length)? nums1[j+1]: Double.POSITIVE_INFINITY ;
         System.out.println("nums1Right = "+nums1Right);
    
         if(nums1Left <= nums2Right && nums2Left <= nums1Right)
         {
            if(totalSize % 2 ==0) // even total
            {
                double x= Math.max(nums1Left,nums2Left);
                double y= Math.min(nums1Right,nums2Right);
                System.out.println("x = "+ x + " y="+y);
                System.out.println("Median even= "+ (x+y)/2.0);
                break;
            }
            else
            {
                double x = Math.min(nums1Right,nums2Right);
                System.out.println("Median odd = "+ x);
                break;
            }
         }
         else if (nums2Left > nums1Right)
         {
            System.out.println("r = "+ r);
                r --;
         }
         else
         {
            l++;
            System.out.println("l = "+l);
         }
    }
}
    
    
}
