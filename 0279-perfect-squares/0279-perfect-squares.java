class Solution {
    public int numSquares(int n) {
        int res=n;
        int num=2;
        while(num*num<=n){
            int x = n/(num*num);
            int y = n%(num*num);
            res = Math.min(res, x+numSquares(y));
            ++num;
        }
        return res;
    }
}