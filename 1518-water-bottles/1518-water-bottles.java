class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int filled = numBottles;
        int empty=filled;
        int count=filled;
        while(empty>=numExchange) {
             filled = empty / numExchange;
            count+=filled;
            empty=(empty%numExchange)+filled;
        }
        return count;
    }
}