class Solution {
    public boolean checkPossibility(int[] nums) {
       // int count = 0,, pos = 0; //pos: index of the last turning point
       // for(int i=1; i<nums.length; i++){ 
       //    if(nums[i]<nums[i-1]){            
       //      count++;
       //      pos = i;
       //    }
       //    if(count>1){
       //      return false;
       //    }
       // }
       // if(count==1 && pos>1 && pos<nums.length-1){
       //     return nums[pos-1]<=nums[pos+1] || nums[pos-2]<=nums[pos]; //check if array is non-decreasing without element at pos or pos-1
       // }
       // return true;
        
        int pos =-1;
        for(int i =0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                if (pos!=-1){
                    return false;
                }
                pos=i;
            }
        }
    return  pos==-1 || pos==0 || pos==nums.length-2 || nums[pos-1]<=nums[pos+1] || nums[pos]<=nums[pos+2];
        
    }
}