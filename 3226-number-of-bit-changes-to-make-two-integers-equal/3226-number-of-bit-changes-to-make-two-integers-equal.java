class Solution {
    public int minChanges(int n, int k) {        
        if ( (n & k) != k){
            return -1;
        }
        int res = 0;
        char[] nA= Integer.toBinaryString(n).toCharArray();
        char[] kA= Integer.toBinaryString(k).toCharArray();
        int nl = nA.length-1;
        int kl = kA.length-1;
        while(nl>=0 && kl>=0){
            if(nA[nl]!=kA[kl]){
                res++;
            }
            nl--;
            kl--;
        }
        while(nl>=0){
            if(nA[nl]=='1'){
            res++;
            }
            nl--;
        }
        return res;
    }
}