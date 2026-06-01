class Solution {
    public int minimumCost(int[] cost) {

        if(cost.length==1)
         return cost[0];

        if(cost.length==2)
         return cost[1]+cost[0];

        Arrays.sort(cost);
        int sum=0,j=1;

        for(int i=cost.length-1;i>=0;i--)
        {
           if(j++%3==0)
            continue;
            else 
             sum+=cost[i]; 
        }
        return sum;
    }
}