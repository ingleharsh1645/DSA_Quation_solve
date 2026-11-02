class Solution {
    public int majorityElement(int[] nums) {


      // Optimal Approaches : 
      // Moore's Voting Algorithms :
      // checks with parts :
      // Time Complexity : O(N)
      // Space Complexity : O(1)
      
      int count = 0;
      int element=-1;
      int n = nums.length;
      for(int i=0;i<n;i++){
        if(count==0){
            count++;
            element = nums[i];
        }else if(nums[i]==element){
            count++;

        }else{
            count--;
        }
      }
       int count1=0;
       for(int i=0;i<n;i++){
        if(nums[i]==element){
            count1++;
        }
       }
       if(count1>n/2){
        return element;
       }

      return -1;
        // Brute Force Solution : 
        // Time Complexity : O(N)^2 
        // time limit excced aayega : 50,000 * 50,000 = 250 crore bar ghum raha hai par leetcode ke limit hai ke 10 cr operation perform kar sakate hai

        // int majorityelement=nums[0];
        // int Max_count=0;
        // int n = nums.length;
        
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //           count++;
        //         }   
        //     }
        //     if(count>n/2){
        //         Max_count = count;
        //         majorityelement=nums[i];
        //     }
              
        // }
        
        //  return majorityelement;

      // Better Time Complexity : 
      // Creting the HashMap:
      // Time complexity : O(N)
      // Space Complexity : O(N)
    //   int n = nums.length;

    //   HashMap<Integer,Integer> map = new HashMap<>();
    //   int target = n/2;

    //   for(int count : nums){
    //     map.put(count,map.getOrDefault(count,0)+1);
    //     if(map.get(count)>target){
    //         return count;
    //     }
        
    //   }
    //     return -1;
        
    }
}