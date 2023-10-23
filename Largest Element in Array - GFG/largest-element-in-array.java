//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        int keep[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int min_idx=0;
            for(int j=1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            keep[i]=arr[min_idx];
            arr[min_idx]=Integer.MAX_VALUE;
        }
        int a=keep[n-1];
        return a;
    }
}