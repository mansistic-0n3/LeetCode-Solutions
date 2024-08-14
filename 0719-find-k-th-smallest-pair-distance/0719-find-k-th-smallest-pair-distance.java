// class Solution {
//     public int smallestDistancePair(int[] nums, int k) {
//         List<Integer> list = new ArrayList();
//         for (int i=0; i<nums.length-1; i++){
//             for (int j=i+1; j<nums.length; j++){
//                 list.add(Math.max(nums[i], nums[j]) - Math.min(nums[i], nums[j]));
//             }
//         }
//         Collections.sort(list);
//         return list.get(k-1);
//     }
// }

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countPairs(nums, mid) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    private int countPairs(int[] nums, int target) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= target) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }
}
