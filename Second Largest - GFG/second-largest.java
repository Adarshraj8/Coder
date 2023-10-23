//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
      
                    HashSet<Integer> h    = new  HashSet<Integer>();
                     for(int i=0;i<n;i++)
                 {
                      h.add(arr[i]);
                 }
                 PriorityQueue<Integer> p = new  PriorityQueue<Integer>(Collections.reverseOrder());
                 for(int a :h)
                 {
                      p.add(a);
                 }
                 
                 int firstMax=p.poll();
                 int secondMax=firstMax;
                 
                 while(!p.isEmpty()&&secondMax==firstMax)
                 {
                     secondMax=p.poll();
                 }
       
        if(firstMax==secondMax)
        return -1;
        
        return secondMax;
}
}