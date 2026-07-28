class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String s:s1.split(" "))
        {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" "))
        {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

         List<String> li=new ArrayList<>();

         for(Map.Entry<String,Integer> e:hm.entrySet())
         {
            if(e.getValue()==1)
            {
                li.add(e.getKey());
            }
         }
        return li.toArray(new String[0]);
    }
}