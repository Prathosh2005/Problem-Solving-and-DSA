class Solution {
    public int missingInteger(int[] a) {
    
      if(a.length==1)
       return a[0]+1;
      
       int sum=a[0];

       for(int i=1;i<a.length;i++)
       {
          if(a[i]==a[i-1]+1)
            sum+=a[i];
          else
           break;
       }

       Set<Integer> set=new HashSet<>();

       for(int i:a)
        set.add(i);

       while(set.contains(sum))
       {
         sum+=1;
       }

       return sum;

    }
}