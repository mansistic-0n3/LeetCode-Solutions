class Solution {
    public int rob(int[] nums) {
        int even=0;
        int odd=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
            even+=nums[i];
            even=Math.max(odd,even);
            }else{
                odd+=nums[i];
                odd=Math.max(odd,even);
            }
        }
        return Math.max(odd,even);
    }
}