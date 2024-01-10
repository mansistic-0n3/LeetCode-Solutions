class Solution {
    int[] qb= new int[46];
    public int climbStairs(int n) {
        if(n==2||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        
        int stair=climbStairs(n-1)+climbStairs(n-2);
        qb[n]=stair;
            return stair;
    }
}