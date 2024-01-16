class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=m, i=0;j<m+n; j++){
            nums1[j]=nums2[i];
            i++;
        }
        Arrays.sort(nums1);
    }
}