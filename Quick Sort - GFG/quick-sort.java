//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
        int p = partition(arr,low,high);
         quickSort(arr,low,p-1);
         quickSort(arr,p+1,high);
    }
    }
    static int partition(int arr[], int low, int high)
    {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int k = arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=k;
        return (i+1);
    } 
}
