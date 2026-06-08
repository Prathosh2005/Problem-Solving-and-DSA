class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int a[]=new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
             a[t++]=nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]==pivot)
          a[t++]=pivot;
        }

         for(int i=0;i<nums.length;i++)
         {
          if(nums[i]>pivot)
          {
            a[t++]=nums[i]; 
          }
         }

           return a;
    }
}