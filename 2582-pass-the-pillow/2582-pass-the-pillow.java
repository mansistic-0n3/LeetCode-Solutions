class Solution {
    public int passThePillow(int n, int time) {
        int i=0;
        int count=1;
        int dir=1;
        while(i<time){
            if(0<count+dir && count+dir<=n){
                count+=dir;
                i++;
            }else{
                dir *= -1;
            }
        }
        return count;
    }
}