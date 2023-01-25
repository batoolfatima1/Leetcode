import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3};
        int[] nums2 = {0,2,5,9};
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n=0;
        int m=0;
        while(n < nums1.length && m < nums2.length)
        {
            if(nums1[n] == nums2[m])
            {
                arr.add(nums1[n]);
                n++;
                m++;
                
            }
            else if(nums1[n]< nums2[m])
            {
                n++;
            }
            else
            {
                m++;
            }
        }
        
        int[] f = arr.stream().mapToInt(i -> i).toArray();
        for(Integer k : f)
        {
            System.out.println( "*" + k);
        }
        

        
        // nums1 = [4,9,5], nums2 = [9,4,9,8,4]

        // 4,9,5
        // 4,4,8,9,9

        // ArrayList<Integer> nums1_Arr = new ArrayList<>();
        // for(Integer i : nums1)
        // {
        //     nums1_Arr.add(i);
        // }

        // ArrayList<Integer> nums2_Arr = new ArrayList<>();
        // for(Integer i : nums2)
        // {
        //     nums2_Arr.add(i);
        // }
        
        // for(Integer i : nums1_Arr)
        // {
        //     for(Integer j : nums2_Arr)
        //     {
        //         if(nums1_Arr.get(i) == nums2_Arr.get(j))
        //         {
        //             arr.add(i) ;
        //             nums2_Arr.remove(j);
        //             break;
        //         }
        //     }
        // }
        

        // int[] f = arr.stream().mapToInt(i -> i).toArray();
        // for(Integer k : f)
        // {
        //     System.out.println(k);
        // }
    }
}
