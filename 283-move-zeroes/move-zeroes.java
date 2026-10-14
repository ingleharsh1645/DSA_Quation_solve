class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // Brute force approches :

        // creating the temparory array :
        ArrayList<Integer> temp = new ArrayList<>();
        // printing the non zeroes number inside the temparory element
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }

        // intialized the non zero element inside the nums array :
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }



        // intialized the remaining element zero inside the nums array : 
        for(int i=temp.size();i<n;i++){
             nums[i]=0;
        }
    
       
        
    }
}