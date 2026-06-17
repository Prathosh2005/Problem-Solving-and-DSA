class Solution {
    public boolean validUtf8(int[] data) {
       int t=0;
       for(int i=0;i<data.length;i++)
       {
        if(t>0)
        { if(data[i]>>6!=0b10)
             return false;

            t-=1;
        }
        else 
        {
            if(data[i]>>7==0)
                continue;
            if(data[i]>>5==0b110)
                t=1;
            else if(data[i]>>4==0b1110)
                t=2;
            else if(data[i]>>3==0b11110)
                t=3;
            else
                return false;
        }
       } 
       return t==0;
    }
}