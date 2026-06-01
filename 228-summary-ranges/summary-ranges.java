class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();

        if(nums.length==0)
         return li;

         if(nums.length==1)
         {
            li.add(String.valueOf(nums[0]));
            return li;
         }

        int st=0,i;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            {
                continue;
            }
            else
            {
                if(st!=i)
                {
                 String s=String.valueOf(nums[st])+"->"+String.valueOf(nums[i]);
                 li.add(s);
                 st=i+1;
                }
                else
                {
                    li.add(String.valueOf(nums[i]));
                    st++;
                }
            }
        }
        

            if(nums[i-1]+1==nums[i])
            {
               String s=String.valueOf(nums[st])+"->"+String.valueOf(nums[i]);
                 li.add(s);
            }
             else
                {
                    li.add(String.valueOf(nums[i]));
                }
        
        return li;
    }
}