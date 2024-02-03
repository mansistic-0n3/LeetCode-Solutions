class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i!=nums[i]){
                return i;
            }
            if(i==nums.length-1){
                return i+1;
            }
            if(nums[0]!=0){
                return 0;
            }
        }
        return 0;
    }
}