class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // HashSet where used the stored the singal value 

        // HashSet : singal value jab used hota hai tab HashSet used hota hai (like number,password,single integer)(duplicate na hoo)

        // HashMap : jab appko pair me data check karna ho (like naam or number,roll num or nam)

        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
         if(!arr.contains(i)){
            return i;
         }
        }
         return -1;
        
    }
}