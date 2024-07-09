class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList();
        if(numRows ==0) return outer;
        for(int i=0; i<numRows; i++){
            List<Integer> inner = new ArrayList();
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    inner.add(1);
                }else{
                    int val = outer.get(i-1).get(j) + outer.get(i-1).get(j-1);
                    inner.add(val);
                }
            }
            outer.add(inner);
        }
        return outer;
    }
}