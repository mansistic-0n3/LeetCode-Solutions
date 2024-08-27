class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int m=0;
        while(m<k){
            int min= Integer.MAX_VALUE;
            int val=0;
            for(int i=0; i<nums.length; i++){
               if (nums[i] < min) {
                    min = nums[i];
                    val = i;
                }
            }
            nums[val]=min*multiplier;
            m++;
        }
        return nums;
    }
}