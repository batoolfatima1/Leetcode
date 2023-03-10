// O(n+m) Solution

class Solution {
    public double FindMedianOfTwoSortedArraysLessEfficient(int[] nums1, int[] nums2)
    {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] nums3 = new int[size1+size2];
        int i=0,j=0,k =0;
        while(i<size1 && j< size2)
        {
            if(nums1[i]< nums2[j])
            {
                nums3[k++] = nums1[i++];
            }
            else
            {
              nums3[k++] = nums2[j++];   
            }
        }
        while (i < size1)
         {
            nums3[k++] = nums1[i++];
         }
         while(j < size2)
         {
             nums3[k++] = nums2[j++];
         }

         int size3 = nums3.length;
         if(size3%2 == 0)
         {
             int x = size3/2 ;
             float r = (float)(nums3[x] + nums3[x-1])/2;
             return r ;
         }
         else
         {
             int x = Math.round(size3/ 2);
             return nums3[x];
         }
    }
}