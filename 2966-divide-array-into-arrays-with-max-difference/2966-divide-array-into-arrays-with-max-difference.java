class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // int len = nums.length;
        // int[][] res = new int[len/3][3];
        // Arrays.sort(nums);
        // for(int i=0,m=0; i<len; i=i+3,m++){
        //     res[m][0] = nums[i];
        //     for(int j=1; j<3; j++){
        //         if(nums[i+j]-res[m][0]<=k){
        //             res[m][j]=nums[i+j];
        //         } else{
        //             return new int[0][0];
        //         }
        //     }
        // }
        // return res;
        
         int ans[][]=new int[nums.length/3][3];
        int ind=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3)
        {
            int first=nums[i];
            int second=nums[i+1];
            int third=nums[i+2];
            if(third-first <= k)
            {
                ans[ind][0]=first;
                ans[ind][1]=second;
                ans[ind][2]=third;
                ind++;
            }
            else
            {
                return new int[0][0];
            }
        }
        return ans; 
    }
}