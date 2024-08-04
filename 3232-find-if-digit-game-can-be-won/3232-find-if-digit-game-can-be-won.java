class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum=0;
        int doubleSum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<10){
                singleSum+=nums[i];
            }
            if(nums[i]>=10){
                doubleSum+=nums[i];
            }
        }
        if (singleSum > doubleSum || singleSum < doubleSum) return true;
        return false;
    }
}