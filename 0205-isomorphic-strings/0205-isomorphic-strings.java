class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ch = new HashMap<>();
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        
        for(int i =0; i<sA.length; i++){
            if(!ch.containsKey(sA[i]) && !ch.containsValue(tA[i])){
                ch.put(sA[i],tA[i]);
            }else{
                if(ch.get(sA[i])== null || !(ch.get(sA[i]).equals(tA[i]))){
                    return false;
                }
            }
        }
        return true;
    }
}