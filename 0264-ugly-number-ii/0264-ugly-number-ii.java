// class Solution {
//     public int nthUglyNumber(int n) {
//         int i = 1;
//         int count = 0;
//         int res = 0;
        
//         while (count < n) {
//             if (isUgly(i)) {  
//                 count++;
//                 res = i;
//             }
//             i++;
//         }
//         return res;
//     }
    
//     private boolean isUgly(int num) {
//         if (num == 1) return true;
//         while (num % 2 == 0) num /= 2;
//         while (num % 3 == 0) num /= 3;
//         while (num % 5 == 0) num /= 5;
//         return num == 1;
//     }
// }
class Solution {
    public int nthUglyNumber(int n) {
        int num = 1;
        int l1 = 1;
        int l2 = 1;
        int l3 = 1;
        int[] arr = new int[n+1];
        arr[1] = 1;
        for(int i = 2; i < n + 1; i++) {
            num = Math.min(arr[l1] * 2, Math.min(arr[l2] * 3, arr[l3] * 5));
            arr[i] = num;

            if(num == arr[l1] * 2) {
                l1++;
            }
            if(num == arr[l2] * 3) {
                l2++;
            }
            if(num == arr[l3] * 5) {
                l3++;
            }
        }
        return num;
    }
}
