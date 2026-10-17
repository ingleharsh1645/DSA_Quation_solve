class Solution {
    public int missingNumber(int[] nums) {

        // with using the xor function : 
        // xor properties : same value zero value and different value those value num
        // A^A=0 and A^0=A properties 

       int n = nums.length;
       // take the o(n):SpaceComplexity 
        HashSet arr = new HashSet<>();
        // sare element dall denge : 
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }

// arr.contains check karta hai ke ke kya yah elment hashset me hai ke nahi 
        for(int i=0;i<=n;i++){
            if(!arr.contains(i)){
                return i;
            }
        }
           return -1;
        
    }
}