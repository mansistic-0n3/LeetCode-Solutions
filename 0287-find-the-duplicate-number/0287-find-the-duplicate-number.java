class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!a.add(nums[i])){
                return nums[i];
            }
        }
    return 0;
    }
}