class Solution {
    public int firstMissingPositive(int[] nums) {
        int p=1;
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                uniqueSet.add(num);
            }
        }
        List<Integer> l = new ArrayList<>(uniqueSet);
        System.out.println(l);
        Collections.sort(l);
        for(int i=0; i<l.size(); i++){
            if(l.get(i)==p){
                p++;
            }else{
                return p;
            }             
        }
        if(l.size()==0)return 1;
        
        return l.get(l.size()-1)+1;
    }
}