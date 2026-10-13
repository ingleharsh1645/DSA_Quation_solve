class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k % n;

        // reverse the  whole element :
        reverse(nums,0,n-1);

        // reverse the another side elment :
        reverse(nums,k,n-1);

        // reverse the first element  :
        reverse(nums,0,k-1);
    }


 public void reverse(int[] nums ,int start,int end ){
    while(start<end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]= temp;
        start++;
        end--;
    }
 }
}
   



   // optimize technique : reverse technique used 
   // [1,2,3,4,5,6,7] => [5,6,7,1,2,3,4]





                

    








// my first apporach to solve that problem : 

// Number of Rotation :
   // rotated the array by the k=3 places 
   // [1,2,3,4,5,6,7]
   // rotation 1 =>
   // [7,1,2,3,4,5,6]
   // rotation 2 =>
   // [6,7,1,2,3,4,5]
   // rotation 3 =>
   // [5,6,7,1,2,3,4]
   // rotation 4 => 
   // [4,5,6,7,1,2,3]
   // rotation 5 =>
   // [3,4,5,6,7,1,2]
   // rotation 6 =>
   // [2,3,4,5,6,7,1]
   // rotation 7 =>
   // [1,2,3,4,5,6,7]



 // k=k%n ==> (k=3 so that k=3%7 ==> 1) 
 // rotated the array : [7,6,5,4,3,2,1] 
 // rotated that the array : k-1 (1) places(k=3)==>[6,7,5,4,3,2,1]
 // rotated the element : of  to n-1 ==>[5,6,7,1,4,3,2]


//     int n = nums.length;
//     int cost ;
//     int temp ;
//    for(int i=1;i<=k;i++){
//       temp = nums[n-k]; 
//       nums[0]=temp;
//       for(int j=0;j<n-1;j++){
//         cost = nums[j+1];
//         nums[j+1]=nums[j];
//         nums[j]=cost;
//       }


  // }