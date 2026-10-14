class Solution {
    public void moveZeroes(int[] nums) {
        // optimal approaches : 
        // two pointer apporaches : 
        int n = nums.length;
        // first oth element  :
        // first pointer :
        int j =-1;
        
        
        for(int i=0;i<n;i++){
             if(nums[i]==0){
               j = i;
               break;
             }
        }

        // agar array me zeo nahi hai toh code yahi ruk jayega : 
        if(j==-1){
            return ;
        }

        // swap the all element in the nums non zero element  :
        for(int i=j;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[j] = nums[i];
                nums[i] = temp; 
                j++;
            }
        }

        // initiallized the zero elment into the array : 
        for(int i=j;i<n;i++){
            nums[i]=0;
        }

    }
}