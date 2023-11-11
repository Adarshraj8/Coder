//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        
        int floor= getfloor(arr,n,x);
        int  ceil =  getceil(arr,n,x);
        return new Pair(floor,ceil);
        
    }
    
    public int getfloor(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        int floor=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
             return arr[mid];
             
             else if(arr[mid]<x)
             {
                 floor=arr[mid];
                 low=mid+1;
                 
             }
             else{
                 high=mid-1;
             }
            
        }
        return floor;
    }
    
    public int getceil(int arr[],int n,int x)
    {
        int low=0;
        int high =n-1;
        int ceil=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            return arr[mid];
            
            else if(arr[mid]<x)
            {
                 
                low=mid+1;
            }
            else{
               ceil=arr[mid];
                high=mid-1;
            }
        }
        return ceil;
    }
}

