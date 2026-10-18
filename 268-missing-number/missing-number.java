class Solution {
    public int missingNumber(int[] nums) {
        // Better Aproches : 
        // Time Complexity : O(N)
        // Space Complexity : O(N)
       
        int n = nums.length;
        // Used the HashSet: Take the unique elment 
        // initiallized  the HashSet ;
        HashSet s1 = new HashSet<>();
        for(int i=0;i<n;i++){
             s1.add(nums[i]);
        }

        for(int i=0;i<=n;i++){
            // contains is boolean return type : 
            if(!s1.contains(i)){
                return i;
            }
        }
     // Dummy return type :
     return -1;

    }
}