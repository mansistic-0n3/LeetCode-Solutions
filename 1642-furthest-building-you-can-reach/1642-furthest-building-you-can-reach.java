// class Solution {
//     public int furthestBuilding(int[] nums, int bricks, int ladders) {
//         int d=0;
//         int building=0;
//         for (int i = 0; i<nums.length-1; i++){
//             if(nums[i]<=nums[i+1]){
//                 d=nums[i+1]-nums[i];
//                 if(bricks>=d){
//                     building++;
//                     bricks-=d;
//                 }else if(ladders>0){
//                     building++;
//                     ladders--;
//                 }else if(ladders==0 && bricks==0){
//                     break;
//                 }
//             }else{
//                 building++;
//             }
//         }
//         return building;
//     }
// }

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                pq.offer(diff);
                if (pq.size() > ladders) {
                    bricks -= pq.poll();
                    if (bricks < 0) return i;
                }
            }
        }
        
        return n - 1;
    }
}
