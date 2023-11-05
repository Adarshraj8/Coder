//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int searchInSorted(int arr[], int N, int k)
    {
        
        // Your code here
        int low=0;
        int high=N;
        int a = (low+high)/2;
        
        if(arr[a]==k)
        return 1;
        
        if(arr[a]>k)
        {
            for(int i=0;i<a;i++)
            {
                if(arr[i]==k)
                return 1;
            }
        }
        if(arr[a]<k)
        {
            for(int i=a+1;i<N;i++)
            {
                if(arr[i]==k)
                {
                    return 1;
                }
            }
        }
        return -1;
    }
}