//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
      HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
      for(int p:nums)
       h.put(p,h.getOrDefault(p,0)+1);
       
        
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(h.entrySet());
        
       /* list.sort(new Comparator<Map.Entry<?,?>>()
        {
            public int compare(Map.Entry<?,?> a,Map.Entry<?,?> b)
            {
                if(Objects.equals(a.getValue(),b.getValue()))
                return ((Integer)b.getKey()).compareTo((Integer)a.getKey());
                else
                return((Integer)b.getValue()).compareTo((Integer)a.getValue());
            }
        });*/
        list.sort((a,b)->{
            if(Objects.equals(a.getValue(),b.getValue()))
            return b.getKey() - a.getKey();
            else
            return b.getValue() - a.getValue();
        });
        int store[]=new int[k];
        for(int i=0;i<k;i++)
        {
            store[i]= list.get(i).getKey();
        }
        return store;
    }
    }