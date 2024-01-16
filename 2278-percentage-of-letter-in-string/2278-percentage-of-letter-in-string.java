class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        char[] a=s.toCharArray();
        for(int i=0; i<a.length; i++){
            if(a[i]==letter){
                c++;
            }
        }
        return (c*100)/s.length();
    }
}