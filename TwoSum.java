class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int total_count = nums.length;
        int x,check =0;
        int result[]= {0,0};
        for(int i=0; i< total_count;i++)
        {
            x= nums[i];
            for(int j=i+1; j< total_count; j++)
            {
                check = x+nums[j];
                if(check == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
      
        return result;
        
    }
}
    public static void main(String[] args)
    {
        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSum s = new TwoSum();
        int res[] =s.twoSum(nums, target);
        System.out.println(res);
    }

