class Solution {
    public int missingNumber(int[] nums) {
        // Bruteforce Approaches will be :
        // Time Complexity : O(N)^2 
        // Space Complexity : O(1) 

      // Dry run : 
      //[3,0,1] ===> 
      // i=0 => nums[0]=3,nums[1]=0,nums[2]=1 ==> yes '0' are present 
      // i=1 => nums[0]=0 ,nums[1]=0,nums[2]=1 ==> yes '1' are present 
      // i=2 => nums[0]=3,nums[1]=0,nums[2]=1 ==> no '2' are not present
      // i=3 => nums[0]=3,nums[1]=0,nums[2]=1 ==> yes '3' are present 
      // output : 2 

        int n = nums.length;

        for(int i=0;i<=n;i++){
           boolean miss_num = false ;

         for(int j=0;j<n;j++){
            if(nums[j]==i){
              miss_num = true ;
           }
        }

        if(miss_num!=true){
            return i;
        }
     }

     // Dummy output :
     return -1;
    }
}