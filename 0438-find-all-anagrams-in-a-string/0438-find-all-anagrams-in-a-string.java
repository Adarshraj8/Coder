class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if(m>n)
        {
            return l;
        }
        int arrs[] = new int[26];
        int arrp[] = new int[26];
        for(int i=0;i<m;i++)
        {
            arrs[s.charAt(i)-'a']++;
            arrp[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=n-m;i++)
        {
            if(isequal(arrs,arrp))
            {
                l.add(i);
            }
            arrs[s.charAt(i)-'a']--;
            if(i+m<n)
            {
                arrs[s.charAt(i+m)-'a']++;
            }
        }
            return l;
        
    }
        private boolean isequal(int []arrs,int []arrp)
        {
            for(int i=0;i<26;i++)
            {
                if(arrs[i]!=arrp[i])
                    return false;
            }
            return true;
        }
    
}