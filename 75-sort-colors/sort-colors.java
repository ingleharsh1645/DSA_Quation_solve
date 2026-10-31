class Solution {
    public void sortColors(int[] nums) {
    // Total time complexity : O(2N) ==> O(N)
    // To solve the Better Approches : 
    // Take the whole for loop of the array : 
   int count_0 = 0;
   int count_1 = 0;
   int count_2 = 0;
    int n = nums.length;
    // O(N) ==> T.C
    for(int i=0;i<n;i++){

         if(nums[i] == 0){
           count_0++;           
         }else if(nums[i]==1){
            count_1++;
         }else{
            count_2++;
         }

    } 

    //Add the '0','1','2' in the nums[] array
    // O((N)) ==> T.C
    // O(count_0 times)
    for(int i=0;i<count_0;i++){
        nums[i]=0;
    }
    // O(count_1 times)
    for(int i=count_0;i<count_0+count_1;i++){
        nums[i]=1;
    }
    // O(count_2 times)
    for(int i=count_0+count_1;i<count_0+count_1+count_2;i++){
        nums[i]=2;
    }
        
  }
}