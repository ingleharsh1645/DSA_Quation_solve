class Solution {
    public int removeDuplicates(int[] nums) {
        // Better Approaches : 
    // space complexity : O(N)
    // Time Complexity : O(N)
        // nums[1,1,2] 
        // created : nums[1,2]
        int n = nums.length;
        // using HashSet used also solve the quation :
        // 
        LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            s1.add(nums[i]);
        }

        // print the all s1 : 
        // also create the unique value in the new nums array :
        int index=0;
        for(int val:s1){
        nums[index]=val;
        index++;
       
      
        }
          return s1.size();         
     }
        
    }
