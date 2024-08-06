class Solution {
    public String getEncryptedString(String s, int k) {
        char[] c = s.toCharArray();
        char[] ans = new char[c.length];
        k=k%c.length;
        for(int i=0; i<c.length; i++){
            int n = i+k;
            if(n>c.length-1){
                n-=c.length;
            }
            ans[i]=c[n];
        }
        return new String(ans);
    }
}