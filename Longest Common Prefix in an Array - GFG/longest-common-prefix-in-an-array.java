//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
          
          if(n==0)
          return "-1";
          
           String minstr =arr[0];
           for(int i=0;i<n;i++)
           {
               if(arr[i].length()<minstr.length())
               {
                   minstr=arr[i];
               }
           }
           
    StringBuilder  result  = new StringBuilder();
           for(int i=0;i<minstr.length();i++)
           {
               char current = minstr.charAt(i);
              for(int j=1;j<n;j++)
              {
                  if(arr[j].charAt(i)!=minstr.charAt(i)){
                  return result.length() == 0 ? "-1" : result.toString();
                  }
                 
              }
              
              result.append(current);
           }
           return result.toString();
    }
}