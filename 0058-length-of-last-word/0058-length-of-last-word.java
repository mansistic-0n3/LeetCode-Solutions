class Solution {
    public int lengthOfLastWord(String s) {
        String[] m=s.trim().split(" ");
        return m[m.length-1].length();
        // for(int i=s.length()-1; i>0; i--){
        //     if(s.charAt(i)==' '){
        //         return s.length()-i-1;
        //     }
        // }
        // return s.length();
    }
}