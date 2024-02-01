class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] res = new int[nums.length/3][3];
        Arrays.sort(nums);
        // for(int i=0,m=0; i<nums.length; i=i+3,m++){
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
        
        int ind=0;
        for(int i=0;i<nums.length;i+=3)
        {
            int first=nums[i];
            int second=nums[i+1];
            int third=nums[i+2];
            if(third-first <= k)
            {
                res[ind][0]=first;
                res[ind][1]=second;
                res[ind][2]=third;
                ind++;
            }
            else
            {
                return new int[0][0];
            }
        }
        return res; 
    }
}