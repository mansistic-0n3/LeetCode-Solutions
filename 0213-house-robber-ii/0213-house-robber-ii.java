class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int even=0;
        int odd=0;
        for(int i=1; i<nums.length; i++){
            if(i%2==0){
            even+=nums[i];
            even=Math.max(odd,even);
            }else{
                odd+=nums[i];
                odd=Math.max(odd,even);
            }
        }
        int even1=0;
        int odd1=0;
        for(int i=0; i<nums.length-1; i++){
            if(i%2==0){
            even1+=nums[i];
            even1=Math.max(odd1,even1);
            }else{
                odd1+=nums[i];
                odd1=Math.max(odd1,even1);
            }
        }
        return Math.max(Math.max(odd,even),Math.max(even1,odd1));
    }
}