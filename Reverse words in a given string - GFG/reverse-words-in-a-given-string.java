//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
              String s1="";
	      
	           String []arr =   s.split("\\.");
	           //Collections.reverse(Arrays.asList(arr));
	           int low=0;
	           int high=arr.length-1;
	           while(low<high)
	           {
	               String temp = arr[high];
	               arr[high]=arr[low];
	               arr[low]=temp;
	               low++;
	               high--;
	           }
	         s1 = String.join(".",arr);
	           return s1;
    }
}