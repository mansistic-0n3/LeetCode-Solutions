class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        List<Integer> arr= new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                arr.add(grid[i][j]);
            }
        }
        Collections.sort(arr);
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.size(); i++) {
            if (!set.add(arr.get(i))) {
                ans[0] = arr.get(i);
                arr.remove(i);
                break;
            }
        }
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(0)!=1){
                ans[1]=1;
                break;
            }
            if(arr.get(i)+1!=arr.get(i+1)){
                ans[1]=arr.get(i)+1;
                break;
            }else if(i==arr.size()-2){
                ans[1]=arr.get(i)+2;
            } 
        }
        return ans;
    }
}