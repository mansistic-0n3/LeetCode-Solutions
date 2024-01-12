class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int midpoint = length / 2;
        char[] a = new char[midpoint];
        char[] b = new char[length - midpoint];
        s.getChars(0, midpoint, a, 0);
        s.getChars(midpoint, length, b, 0);
        int count1=0;
        int count2=0;
        char[] vow = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i=0; i<vow.length; i++){
            for(int j=0; j<b.length; j++){
                if(vow[i]==b[j]){
                    count1++;
                }
            }  
        }
         for(int i=0; i<vow.length; i++){
            for(int j=0; j<a.length; j++){
                if(vow[i]==a[j]){
                    count2++;
                }
            }  
        }
        
        return count1==count2;
    }
}