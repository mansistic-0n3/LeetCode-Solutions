class Solution {
    public String convert(String s, int numRows) {
    int l=s.length();
    StringBuffer [] arr = new StringBuffer[numRows]; 
        for(int i=0; i<numRows; i++) {
            arr[i] = new StringBuffer();       
        }
        int i=0;
        while(i<l){
            for(int j=0; j<numRows && i<l; j++){
                arr[j].append(s.charAt(i++));
            }
            for(int j=numRows-2; j>0 && i<l; j--){
                arr[j].append(s.charAt(i++));
            }
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer el : arr){
            ans.append(el);
        }
        return ans.toString();
    }
}