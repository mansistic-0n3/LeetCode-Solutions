// class Solution {
//     public int[] plusOne(int[] digits) {
//         int l=digits.length-1;
//         int num=0;
//         if(digits[l] != 9){
//            digits[l]=digits[l]+1;
//         }else if(digits[l]==9 && digits[0]==9){
//             int[] nums =new int[l+2];
//             System.arraycopy(digits,0,nums,0,digits.length);
//             for(int i=nums.length-1; i>=0; i--){
//                 nums[i]=0;
//                 num=i;
//             }
//             nums[num]=nums[num]+1;
//             return nums;
//         }else{
//             for(int i=digits.length-1; i>=0; i--){
//                 if(digits[i]==9){
//                     digits[i]=0;
//                     num=i-1;
//                 }
//             }
//             digits[num]=digits[num]+1;
//         }
//         return digits;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;

        for(int i=len-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int [] temp = new int [len+1];
        temp[0]=1;
        return temp;
    }
}