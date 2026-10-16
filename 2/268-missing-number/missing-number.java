class Solution {

 public int missingNumber(int[] nums) {
 // Brute Force Approaches :
    int n = nums.length;
    for(int i=0;i<=n;i++){
        boolean miss_num = false;
        for(int j =0;j<n;j++){
            if(nums[j]==i)
                miss_num = true; 
        }

        if(miss_num!=true){
            return i;
        }

    }
// Default dummy return 
    return -1;
 
    }
    
    

}

