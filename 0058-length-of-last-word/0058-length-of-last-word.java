class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
         String word = s.trim();
        for(int i=word.length()-1; i>0; i--){
            if(word.charAt(i)==' '){
                return word.length()-i-1;
            }
        }
        return word.length();
    }
}