//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine().trim());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int Key;
            Key = Integer.parseInt(br.readLine().trim());
            
            Solution obj = new Solution();
            boolean res = obj.Search(N, A, Key);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean Search(int n, int[] nums, int target) {
        // code here
        int low =0;
        int high=n-1;
        
        
        int i = find(n,nums,target,low,high);
        if(i<0)
        return false;
        return true;
         
    }
    
    public static int find(int n,int []nums,int key,int low,int high)
    {
        int mid=(low+high)/2;
       Arrays.sort(nums);
        if(low>high)
        return -1;
         
       if(nums[mid]==key)
       return mid;
       
          if(nums[low]<=nums[mid])
          {
              if(key>=nums[low]&&key<=nums[mid])
              {
                  return find(n,nums,key,low,mid-1);
              }
              return find(n,nums,key,mid+1,high);
          }
          
          if(key>=nums[mid]&&key<=nums[high])
          {
              return find(n,nums,key,mid+1,high);
          }
          return find(n,nums,key,low,mid-1);
         
    }
}
        
