class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int count=0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
             sum +=nums[i];
              int rd = sum%k;
               if(rd<0){
                  rd=rd+k;//keeping reminder always positive
               }
            int frq;
             if(map.containsKey(rd))
             {
                frq =  map.get(rd)+1;
                 count +=map.get(rd);
             }
             else{
                 frq=1;
             }
            map.put(rd,frq);
            
        }
        return count;
    }
}