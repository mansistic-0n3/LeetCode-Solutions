class Solution {
public:
    int maxProfit(vector<int>& prices) {
        // int buy,i=0,j=0,profit=0,start,end;
        // int sell=0;
        // for ( i=0; i<prices.size(); i++){
        //     if(buy>prices[i]){
        //         buy=prices[i];
        //         i=start;
        //     }
        //      for ( j=buy; j<prices.size(); j++){
        //         if(sell<prices[j]){
        //             sell=prices[j];
        //             j=end;
        //         }
        //     }
        // }
        // if (start>end){
        //     return 0;
        // }else{  
        //     profit=sell-buy;
        //     return profit;
        // }
        
        int max = 0, m = 0;
        for (int i = 0; i < prices.size() - 1; i++) {
            m += (prices[i + 1] - prices[i]);
            // If difference in price is negative, reject it
            if (m < 0) m = 0;
            else if (max < m) max = m;
        }
        return max;
    }
};