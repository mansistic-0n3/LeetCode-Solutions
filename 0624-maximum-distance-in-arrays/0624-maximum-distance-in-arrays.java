// class Solution {
//     public int maxDistance(List<List<Integer>> arrays) {
//         int res=Integer.MIN_VALUE;
//         int[] minArr = new int[arrays.size()];
//         int[] maxArr = new int[arrays.size()];
//         for(int i=0; i<arrays.size(); i++){
//             minArr[i] = arrays.get(i).get(0);
//             maxArr[i] = arrays.get(i).get(arrays.get(i).size() - 1);
//         }
//         for (int i=0; i<arrays.size(); i++){
//             for(int j=0; j<arrays.size(); j++){
//                 if(i!=j){
//                     res=Math.max(maxArr[j]-minArr[i],res);
//                 }
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = Integer.MIN_VALUE;
        
        // Initialize min and max with the first array
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        // Iterate over the arrays starting from the second one
        for (int i = 1; i < arrays.size(); i++) {
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

            // Calculate the distance using minVal from previous arrays and currentMax, and vice versa
            res = Math.max(res, Math.max(currentMax - minVal, maxVal - currentMin));

            // Update minVal and maxVal with the current array's values
            minVal = Math.min(minVal, currentMin);
            maxVal = Math.max(maxVal, currentMax);
        }

        return res;
    }
}
