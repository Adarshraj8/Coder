//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]

            return i;
	}
	
	void selectionSort(int arr[], int n)
	{
	     
	     int keep[] = new int[n];
	     
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
	          arr[min_idx] = Integer.MAX_VALUE;
	     }
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=keep[i];
	     }
	}
}