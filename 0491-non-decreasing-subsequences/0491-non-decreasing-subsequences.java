class Solution {
        List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {

       backtrack(0,nums,new ArrayList(),Integer.MIN_VALUE);
        return list;
    }
    public void backtrack(int idx ,int nums[],ArrayList<Integer> l,int previous)
    {
        if(idx==nums.length)
        {
            if(l.size()>1)
            {
                list.add(new ArrayList<>(l));
            }
            return ;
        }
        if(nums[idx]>=previous)
        {
            l.add(nums[idx]);
            backtrack(idx+1,nums,l,nums[idx]);
            l.remove(l.size()-1);
        }
        if(nums[idx]==previous){
            return;
        }
            backtrack(idx+1,nums,l,previous);
        
    }
}