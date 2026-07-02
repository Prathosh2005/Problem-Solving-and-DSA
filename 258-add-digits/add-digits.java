class Solution {
    public int addDigits(int num) {
        
        if(num<10)
         return num;
        int t=num;
        int sum=0,flag=t;
        while(flag>9)
        {
            sum=0;
           while(t>0)
           {
            sum=sum+(t%10);
            t=t/10;
           }
          flag=sum;
          t=sum;
        }
        return sum;
    }
}