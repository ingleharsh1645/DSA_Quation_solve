class Solution {
    public int missingNumber(int[] nums) {
        // Optimize Approaches : 
        // Time Complexity : O(2n)
        // Space Complexity : O(1)

      // xor Method : A ^ A = 0 and A ^ 0 = A 
      // Dry run Code : 
      // nums[3,0,1] => 0,1,2,3 ^ 3,0,1 = 2 
      // xor1 = 0,1,2,3 - - -  -(xor1 = 0)
      // xor1 ^ i :
      // 0 ^ 0 = 0
      // 0 ^ 1 = 1
      // 1 ^ 2 = 3  - - -  - - {01 ^ 10 = 11 ==> 3}
      // 3 ^ 3 = 0
      // xor1 = 0 
      
      // xor2 ^ nums[i]
      // xor2 = 0 
      // 0 ^ 3 = 3
      // 3 ^ 0 = 3
      // 3 ^ 1 = 2  - -  - -   - -{11 ^ 01 = 10 ==> 2}
      // xor2 = 2

      // xor1 ^ xor2 = 0 ^ 2 => 2 


      // another dry run : [0,1]
      // xor1 = 0 
      // 0 ^ 0 = 0
      // 0 ^ 1 = 1
      // 1 ^ 2 = 3 - - - - -  -{01 ^ 10 = 11 ==> 3}
      // xor1 = 3
      // xor2 = 0
      // 0 ^ 0 = 0
      // 0 ^ 1 = 1 
      // xor2 = 1

      // xor1 ^ xor2 = 3 ^ 1 => 2  -- - ----{11 ^ 01 = 10} 

     int n = nums.length;
      int xor1 = 0;
      int xor2 = 0;
      for(int i =0;i<=n;i++){
        xor1 = xor1 ^ i; 
      }

      for(int i =0;i<n;i++){
        xor2 = xor2 ^ nums[i];
      }
        
        int miss_num = xor1 ^ xor2 ;

        return miss_num;

    }
}