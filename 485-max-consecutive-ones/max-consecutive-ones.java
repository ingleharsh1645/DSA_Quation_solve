class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max_cons = 0;
        int n = nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
            max_cons = Math.max(max_cons,count);
        }else{
            count=0;
        }
       }

       return max_cons;
    }
}