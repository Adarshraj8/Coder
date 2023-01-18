/* from this example we can understand that maximum sum is either using(kadane's algo) or sum-min_total;
there is special case if sum==min;then return max sum;
algoritham:-
>find max subarray  sum using kadane's algo;
>find min subarray min using kadane' algo;
>find total sum of array;
>if(sum==max)retun max;
>else return max(max,sum-min);
*/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==0)return 0;
        
        int max_cur=nums[0];
        int max_total=nums[0];
         int min_cur=nums[0];
         int min_total=nums[0];
          int sum=nums[0];
         int n=nums.length;
         for(int i=1;i<n;i++)
         {
             int a= nums[i];
              max_cur=Math.max(a,max_cur+a);
              max_total = Math.max(max_cur,max_total);
             
             min_cur = Math.min(a,min_cur+a);
             min_total = Math.min(min_cur,min_total);
             sum+=a;
         }
        if(sum==min_total)return max_total;
         
             return Math.max(sum-min_total,max_total);
         
    }
}