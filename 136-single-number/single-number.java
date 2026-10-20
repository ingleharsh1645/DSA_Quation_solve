class Solution {
    public int singleNumber(int[] nums) {
   // negative element will be not usefull but positive are usefull : 
   // create the hasharray :
   // create the hash array with 0 hash initialization 
   // find the max length of the hash array : 
   // isseme array ka used kiya hai
//     int n = nums.length;
//     int max = 0;
//     for(int i=0;i<n;i++){
//         // find the max element :
//         if(nums[i]>max){
//        // finding the maximum element :   
//         max = Math.max(max,nums[i]);
//         }
//     }

//     //create the hash array (initiallized all ): 
//     int[] hash = new int[max + 1];
//     // increment the array element count  :
//     for(int i=0;i<n;i++){
//        hash[nums[i]]++;
       
//     }
     
//     // [2,2,1]
//     // hash[]
//    for(int i=0;i<n;i++){
//     if(hash[nums[i]]==1){
//         return nums[i];
//     }
//    }
//      return -1;



// used the hasmap : 
int n = nums.length;
HashMap<Long ,Integer> map = new HashMap<>();
// har aak number ke frequency  ko count karoo 
      for(int i=0;i<n;i++){
        // add the num inside the map :
        // sbase pehele elment loo :
        long num = nums[i];
        // sabhi map ke andar se value ko add karte hai or frequency badathe hai 
        map.put(num,map.getOrDefault(num,0)+1);

      } 
      for(int i=0;i<n;i++){
        if(map.get((long) nums[i])==1){
            return nums[i];
        }
      }


      return -1;
 }
}