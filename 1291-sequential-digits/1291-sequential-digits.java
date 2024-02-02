// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
//         String low_num= Integer.toString(low);
//         char[] low_arr = low_num.toCharArray();
//         int low_len = low_num.length();
        
//         String hi_num= Integer.toString(high);
//         char[] high_arr = hi_num.toCharArray();
//         int hi_len = hi_num.length();
        
//         int m=hi_len-low_len;
//         int h=high_arr[0];
//         if(m>0){
//             int d = (int) Math.pow(10, low_len-1);
//             h=high/d;
//         }
//         System.out.println(h);
//         List<Integer> arr= new ArrayList<>();
//         String s="";
//         int i = low_arr[0] - '0';
//         while(i<h){
//             StringBuilder sb= new StringBuilder();
//             int c=0;
//             for(int j=0; j<=hi_len && j<9 && c<9; j++){
//                 j=(i+j)*10+j;
//                 // c=i+j;
//                 sb.append(j);
//                 System.out.println(c);
//                 s = sb.toString();
//                 for(int y=low_len; y>1;y--){
//                     int d = (int) Math.pow(10, y-1);
                    
//                 }
//                 if(s.length()<=hi_len && s.length()>=low_len){
//                     arr.add(Integer.parseInt(s));
//                 }
//             }
//             System.out.println(s);
//             i++;
//         }
//         for(int k=0; k<arr.size(); k++){
//             if(arr.get(k)>high || arr.get(k)<low){
//                 arr.remove(k);
//             }
//         }
//         Collections.sort(arr);
//         return arr;
//     }
// }
// class Solution {
//     public List<Integer> sequentialDigits(int low, int high) {
//         String low_num = Integer.toString(low);
//         int low_len = low_num.length();

//         String hi_num = Integer.toString(high);
//         int hi_len = hi_num.length();

//         int m = hi_len - low_len;
//         int h = hi_num.charAt(0) - '0';

//         if (m > 0) {
//             int d = (int) Math.pow(10, low_len - 1);
//             h = high / d;
//         }

//         List<Integer> arr = new ArrayList<>();
//         int i = low_num.charAt(0) - '0';

//         while (i <= h) {
//             StringBuilder sb = new StringBuilder();
//             int num = i;
            
//             for (int j = 0; j < hi_len && num <= 9; j++) {
//                 sb.append(num);
//                 num++;
                
//                 if (num > 9) {
//                     break;
//                 }
//             }

//             String s = sb.toString();
            
//             if (s.length() <= hi_len && s.length() >= low_len) {
//                 int generatedNumber = Integer.parseInt(s);
//                 if (generatedNumber >= low && generatedNumber <= high) {
//                     arr.add(generatedNumber);
//                 }
//             }

//             i++;
//         }

//         Collections.sort(arr);
//         return arr;
//     }
// }
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int digit = 1; digit <= 9; digit++) {
            generateSequentialDigits(low, high, digit, result);
        }

        Collections.sort(result);
        return result;
    }

    private void generateSequentialDigits(int low, int high, int current, List<Integer> result) {
        if (current > high) {
            return;
        }

        if (current >= low) {
            result.add(current);
        }

        int lastDigit = current % 10;

        if (lastDigit < 9) {
            generateSequentialDigits(low, high, current * 10 + lastDigit + 1, result);
        }
    }
}





