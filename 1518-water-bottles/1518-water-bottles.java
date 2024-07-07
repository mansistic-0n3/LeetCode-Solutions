class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int filled = numBottles;
        int empty=filled;
        int count=filled;
        while(empty>=numExchange) {
             int newBottles = empty / numExchange;
            count+=newBottles;
            empty=(empty%numExchange)+newBottles;
        }
        return count;
    }
}