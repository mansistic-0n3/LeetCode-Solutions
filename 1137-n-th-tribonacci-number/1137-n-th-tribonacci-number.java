class Solution {
    int[] qb= new int[38];
    public int tribonacci(int n) {
        if(n==1||n==0){
            return n;
        }
        if(n==2){
            return 1;
        }
        
        if(qb[n]!=0){
            return qb[n];
        }
        qb[n] = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return qb[n];
    }
}