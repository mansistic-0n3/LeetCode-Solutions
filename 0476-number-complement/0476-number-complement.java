class Solution {
    public int findComplement(int num) {
        String bi = Integer.toBinaryString(num);
        String res="";
        for(int i=0; i<bi.length(); i++){
            if(bi.charAt(i) == '0'){
                res += '1';
            }
            else{
                res += '0';
            }
        }
        // int decimal = Integer.parseInt(res, 2);
        return Integer.parseInt(res, 2);
    }
}