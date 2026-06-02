class Solution {
    public int earliestFinishTime(int[] LST, int[] LD, int[] WST, int[] WD) {

       int min1=Integer.MAX_VALUE; 
       for(int i=0;i<LST.length;i++)
       {
         min1=Math.min(min1,(LST[i]+LD[i]));
       }

       int ans1=Integer.MAX_VALUE;
       for(int i=0;i<WD.length;i++)
       {
           if(WST[i]>min1)
           {
             ans1=Math.min(ans1,(WST[i]+WD[i]));
           }
           else
           ans1=Math.min(ans1,(min1+WD[i]));
       }

       int min2=Integer.MAX_VALUE; 
       for(int i=0;i<WST.length;i++)
       {
         min2=Math.min(min2,(WST[i]+WD[i]));
       }

        int ans2=Integer.MAX_VALUE;
       for(int i=0;i<LD.length;i++)
       {
          if(LST[i]>min2)
          {
             ans2=Math.min(ans2,(LST[i]+LD[i]));
          }
          else
           ans2=Math.min(ans2,(min2+LD[i]));
       }
      
       return Math.min(ans1,ans2);
    }
}