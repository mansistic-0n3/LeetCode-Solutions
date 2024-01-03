class Solution {
    public char findTheDifference(String s, String t) {
        // char c = 0;
        // for(char cs : s.toCharArray()){
        //     c ^= cs;
        // }
        // for(char ct : t.toCharArray()){
        //     c ^= ct;
        // }
        
        ArrayList<Character> abc = new ArrayList<>();
        
        for(int i =0; i<t.length() ;i++){
            abc.add(t.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            abc.remove(abc.indexOf(s.charAt(i)));
        }
        
        return abc.get(0);
    }
}