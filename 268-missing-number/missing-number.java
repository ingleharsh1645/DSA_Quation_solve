class Solution {
    public int missingNumber(int[] nums) {
        // Optimize Approaches : 
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        int sum =0;
        int n = nums.length;
        
        // sum of n th number : 
        int sum_N = n*(n+1)/2;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
         
         int miss_num=sum_N-sum;


        return miss_num;
    }
}