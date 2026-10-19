class Solution {
    public int singleNumber(int[] nums) {
    // jab bhi unique elment valla quation aaye toh xor istemal kare 
    // solve these quation through xor used 
      int n = nums.length;
      int single = 0;
        for(int i=0;i<n;i++){
         single^=nums[i];
        }
        return single;
        
    }
}
// dry run : 
// nums[2,2,1] 
// single = 0
// i=0 ==> 0 ^ 2 = 2
// i=1 ==> 2 ^ 2 = 0
// i=2 ==> 0 ^ 1 = 1  