class Solution {
    public String losingPlayer(int x, int y) {
        String[] arr = {"Bob", "Alice"};
        int flag =0;
        while(x>=1 && y>=4){
            x-=1;
            y-=4;
            flag = (flag == 0) ? 1 : 0;
        }
        return arr[flag];        
    }
}