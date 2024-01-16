class Solution {
    public int buyChoco(int[] prices, int money) {
        
        ArrayList<Integer> p=new ArrayList<>();
        int a=0;
        for(int i =0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(money >=0){
                p.add(prices[i]+prices[j]);
            }
            }
        }
        Collections.sort(p);
            if(p.get(0)<=money){
                money=money-p.get(0);
            }
        return money;
    }
}