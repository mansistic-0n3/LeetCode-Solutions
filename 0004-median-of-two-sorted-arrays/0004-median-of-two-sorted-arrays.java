class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double median=0;
        double sum=0;
        int a=0;
        int[] num=new int[m+n];
         System.arraycopy(nums1, 0, num, 0, m);
         System.arraycopy(nums2, 0, num, m, n);
        Arrays.sort(num);
        if(num.length%2==0){
            a=num.length/2;
            sum=(double)num[a]+num[a-1];
            median=sum/2;
        }else{
            median=num[num.length/2];
        }
        return median;
    }
}