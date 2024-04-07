class Solution {
    public boolean checkValidString(String s) {
        
        int p1=0,p2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p1++;
                p2++;
            } else if(s.charAt(i)==')'){
                p1--;
                p2--;
            } else if(s.charAt(i)=='*'){
                p1++;
                p2--;
            }
            if(p1<0){
                return false;
            }
            if(p2<0){
                p2 = 0;
            }
        }
        return p2==0;
    }
    
//         char[] arr = s.toCharArray();
//         int left =0;
//         int right=0;
//         int star =0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]=='('){
//                 left+=1;
//             }else if(arr[i]==')'){
//                 right+=1;
//             }else{
//                 star+=1;
//             }
//         }
//         while(left!=right && star>0){
//             if(left<right){
//                 left+=1;
//                 star-=1;
//             }else{
//                 right+=1;
//                 star-=1; 
//             }
//         }
//         if(left!=right) return false;
//         return true;
//    }
}