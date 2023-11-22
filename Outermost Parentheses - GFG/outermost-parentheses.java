//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
           char [] arr =  s.toCharArray();
           int  count=0;
        StringBuffer result   = new StringBuffer();
           for(char c :arr)
           {
               if(c=='(')
               {
                   if(count>0)
                   {
                       result.append(c);
                   }
                   count++;
               }
               else{
                   count--;
                   if(count>0)
                   {
                       result.append(c);
                   }
               }
           }
          return result.toString();
    }
}
