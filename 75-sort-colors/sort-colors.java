class Solution {
    public void sortColors(int[] nums) {
        // Optimal Approaches: 
        // Duch National Flag : 
       // used the 3-pointer : low,mid,high
       // Time Complexity : O(N)
       // Space Complexity : O(1)
      
      int low = 0;
      int mid = 0;
      int high = nums.length-1;

       while(mid<=high){
        if(nums[mid]==0){
            swap(nums,mid,low);
            mid++;
            low++;
        }else if(nums[mid]==1){
            mid++;
        }else{
            swap(nums,mid,high);
                high--;
            
        }

       }

        
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}