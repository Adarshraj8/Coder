//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int a[], int l, int m, int r)
    {
        int n1=m-l+1;
        int n2 =r-m;
        int left[] = new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=a[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=a[n1+i];
        }
           Arrays.sort(left);
        Arrays.sort(right);
        int i=0,j=0,k=0;
        while(i<n1&&j<n2)
        {
            if(left[i]<right[j])
            {
                a[k]=left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=right[j];
            j++;
            k++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
         int m=(r+l)/2;
        merge(arr,l,m,r);
    }
}
