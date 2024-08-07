class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();
        int count=0;
        int mod = 1000000007;
        for(int i = 0; i<n; i++){
            int sum=0;
            for(int j=i; j<n;j++){
                sum+=nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        for (int i=left-1; i<right; i++){
            count = (count + list.get(i)) % mod;
        }
        return count;
    }
}