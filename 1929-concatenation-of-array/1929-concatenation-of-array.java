class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[2*l];
        // for(int i=0; i<2*l; i++){
        //     if(i>=l){
        //         ans[i]=nums[i-l];
        //     }else{
        //         ans[i]=nums[i];
        //     }
        // }
        for(int i=0; i<l; i++){
            ans[i]=nums[i];
            ans[l+i]=nums[i];
        }
        
        return ans;
    }
}