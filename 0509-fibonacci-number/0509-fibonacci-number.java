class Solution {
    int[] qb= new int[31];
    public int fib(int n) {
        if(n==1||n==0){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        qb[n] = fib(n-1)+fib(n-2);
        return qb[n];
    }
}