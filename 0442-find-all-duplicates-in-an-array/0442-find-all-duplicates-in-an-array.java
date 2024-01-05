class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        int i =0;
        while(i<nums.length){
            int corr = nums[i]-1;
            if(nums[corr] != nums[i]){
                int temp = nums[corr];
                nums[corr]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
            
        }
            
            for( i = 0; i<nums.length; i++){
                if(nums[i] != i+1){
                    dup.add(nums[i]);
                }
            }
        
        System.out.println(Arrays.toString(nums));
        return dup;
    }
}