class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int m=0;
        while(m<k){
            int val=0;
            for(int i=0; i<nums.length; i++){
               if (nums[i] < nums[val]) {
                    val = i;
                }
            }
            nums[val]=nums[val]*multiplier;
            m++;
        }
        return nums;
    }
}