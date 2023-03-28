//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int size) {
      for(int i=0;i<size;i++)
	{
		for(int k=0;k<size-i-1;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}
	for(int i=size;i>0;i--)
	{
		for(int k=0;k<size-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<i;j++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}
    }
}
