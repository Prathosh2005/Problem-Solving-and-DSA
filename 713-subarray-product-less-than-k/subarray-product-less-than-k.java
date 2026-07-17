class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      
      if(k<=1) return 0;

        int l=0,r=0,count=0,pro=1;
        while(r<nums.length)
        {
            pro*=nums[r];

            while(pro>=k)
            {
                pro/=nums[l++];
            }
            count+=1+(r-l);
            r++;
        }
       return count; 
    }
}