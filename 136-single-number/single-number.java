class Solution {
    public int singleNumber(int[] nums) {
        // Better Approaches : 
        // Time Complexity :
        // Space Complexity : 
        // Hashing to solve 
        // using hashing solve the quation :

         int n = nums.length;
        
         // creating the HashSet : 
         HashSet<Integer> s1 = new HashSet<>();

         for(int i=0;i<n;i++){
        
            if(s1.contains(nums[i])){
                // set me vahi element lena hai jo singal hai 
                s1.remove(nums[i]);
            }else{
                // jo singal hai usse add karna hai
                s1.add(nums[i]);
            }
         }
           
           // har singal elment ko add karna hai s1 ke andar 
           for(int num : s1){
            return num; 
           }
            
            
                return -1;
         } 

    
    }
