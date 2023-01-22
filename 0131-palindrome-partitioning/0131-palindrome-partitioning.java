class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(s,new ArrayList<>(),0,res);
        return res;
    }

   public void backtrack(String s,List<String> l,int idx,  List<List<String>> res) 
   {
       if(idx==s.length())//base condition;
       {
           res.add(new ArrayList<>(l));
           return;
       }
        String temp= "";
       for(int i=idx;i<s.length();i++)
       {
           temp +=s.charAt(i);
            if(!isPalindrome(temp)){
                continue;
            }else{
       l.add(temp);
            }
            backtrack(s,l,i+1,res);
        l.remove(l.size()-1);
     }
 }
    private  boolean isPalindrome(String s)
    {
        int right=s.length()-1,left=0;
        while(left<right){
         if(s.charAt(left++)!=s.charAt(right--))
                return false;
    }
            return true;
    }
}