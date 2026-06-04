class Solution {
    public int totalWaviness(int num1, int num2) {
        
        if(num2 < 100)
         return 0;

        if(num1 < 100 && num2 > 100)
        {
           num1=101;
        } 
        
        int count=0;

        while(num1<=num2)
        {
           char a[]=String.valueOf(num1).toCharArray();
           for(int i=1;i<a.length-1;i++)
           {
             if(a[i]>a[i-1] && a[i]>a[i+1])
              count++;
              else if(a[i]<a[i-1] && a[i]<a[i+1])
               count++;
           }

           num1++;
        }
        return count;
    }
}