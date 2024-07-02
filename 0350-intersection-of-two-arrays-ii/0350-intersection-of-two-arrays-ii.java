class Solution {
    public int[] intersect(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<n && j<m)
        {
            if(a[i]>b[j])
                j++;
            else if(a[i]<b[j])
                i++;
            else
            {
                arr.add(a[i]);
                i++;
                j++;
            }
        }
        int []ans=new int[arr.size()];
        for(int k=0;k<arr.size();k++)
            ans[k]=arr.get(k);
        return ans;
    }
}