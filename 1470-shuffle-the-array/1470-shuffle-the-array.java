class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int count[] = new int[m];
         int i=0;
         int j=m/2;
        int k=0;
        while(i<m/2&&j<m)
        {
            if(i>=0&&j>0){
                count[k]=nums[i];
                i++;
                k++;
                count[k]=nums[j];
                 j++;
                 k++;
               
                
            }
         
        }
        return count;
    }
}