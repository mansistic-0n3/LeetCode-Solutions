class Solution {
    public int findTheWinner(int n, int k) {
        int flag =0;
        ArrayList<Integer> arr = new ArrayList();
        for(int i=1; i<=n; i++){
            arr.add(i);
        }
        while(arr.size()>1){
            int rem = (flag+k-1)%arr.size();
            arr.remove(rem);
            flag = rem;
        }
        return arr.get(0);
    }
}