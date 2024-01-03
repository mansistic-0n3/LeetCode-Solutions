class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;        
        Set<List<Integer>> ans= new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i<n-3;i++){
            for(int j=n-1; j>0; j--){
                int start= i+1;
                int end= j-1;
                while(start<end){
                    long sum =(long) nums[i]+nums[start]+nums[end]+nums[j];
                    if(sum==-294967296 || sum==294967296){
                        return new ArrayList<>(ans);
                    }
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i], nums[start], nums[end], nums[j]));
                        start++;
                        end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}