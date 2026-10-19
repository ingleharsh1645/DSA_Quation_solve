class Solution {
    public int missingNumber(int[] nums) {
        // Optimize Approaches : 
        // Time Complexity : O(2n)
        // Space Complexity : O(1)

     int n = nums.length;
     //Sabse pehle 'n' ko le liya (kyunki loop 0 to n-1 chalega) 
      int miss_num = n ;
      // 0 to n-1 takk akk loop chalega :
      for(int i=0;i<n;i++){
         miss_num = miss_num ^ i ^ nums[i];
      }

        return miss_num;

    }
}