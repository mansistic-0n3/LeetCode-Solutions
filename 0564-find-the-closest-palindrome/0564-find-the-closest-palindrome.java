// class Solution {
//     public String nearestPalindromic(String n) {
//         long number = Long.parseLong(n);
//         long min=number-1;
//         long less = checkPal(min, "minus");
//         // System.out.println("less "+ less);
        
//         long max=number+1;
//         long more = checkPal(max, "plus");
//         // System.out.println("more "+ more);
        
//         // Math.min(Math.abs(number-less),Math.abs(number-more));
//         if(Math.abs(number-less)>Math.abs(number-more)){
//             return Long.toString(more);
//         }else{
//             return Long.toString(less);
//         }
//     }

//     public long checkPal(long n, String op) {
//         if (n <= 0) return 0;
//         long temp = n;
//         long sum = 0;

//         while (n > 0) {
//             long r = n % 10;
//             sum = (sum * 10) + r;
//             n = n / 10;
//         }

//         if (temp == sum) {
//             // return Long.toString(temp);
//             return temp;
//         } else if(op.equals("minus")){
//             return checkPal(temp - 1,"minus");
//         }else{
//             return checkPal(temp + 1,"plus");
//         }
//     }
// }

class Solution {
    public String nearestPalindromic(String n) {
        Long number = Long.parseLong(n);
        
        // I) Edge cases 
        // 1. number <= 10, 100, 1000, 1000... substract 1
        if (number <= 10 || (number % 10 == 0 && n.charAt(0) == '1' && Long.parseLong(n.substring(1)) == 0)) {
            return Long.toString(number - 1);
        }

        // 2. number is 11, 101, 1001, 10001.. substract 2
        if (number == 11 || (number % 10 == 1 && n.charAt(0) == '1' && Long.parseLong(n.substring(1, n.length() - 1)) == 0)) {
            return Long.toString(number - 2);
        }

        // 3. number is 9, 99, 999, 9999.. add 2
        if (isAllNine(n)) {
            return Long.toString(number + 2);
        }

        // II) Construct closest palindrome and calculate absolute difference with n
        boolean isEvenDigits = n.length() % 2 == 0;
        int palindromeRoot = getPalindromeRoot(n, isEvenDigits);

        long samePalindromeRoot = getPalindrome(palindromeRoot, isEvenDigits);
        long diffSame = Math.abs(samePalindromeRoot - number);

        long biggerPalindromeRoot = getPalindrome(palindromeRoot + 1, isEvenDigits);
        long diffBigger = Math.abs(biggerPalindromeRoot - number);

        long smallerPalindromeRoot = getPalindrome(palindromeRoot - 1, isEvenDigits);
        long diffSmaller = Math.abs(smallerPalindromeRoot - number);

        // III) Find closest
        long closest = diffBigger < diffSmaller ? biggerPalindromeRoot : smallerPalindromeRoot;
        long minDiff = Math.min(diffSmaller, diffBigger);

        if (diffSame != 0) { // number is not a palindrome
            if (diffSame < minDiff) {
                closest = samePalindromeRoot;
            } else if (diffSame == minDiff) {
                closest = Math.min(samePalindromeRoot, closest);
            }
        }

        return Long.toString(closest);
    }

    private long getPalindrome(int palindromeRoot, boolean isEvenDigits) {
        long palindrome = palindromeRoot;
        if (!isEvenDigits) palindromeRoot /= 10;//remove last digit
        while (palindromeRoot > 0) {
            palindrome = palindrome * 10 + palindromeRoot % 10;
            palindromeRoot /= 10;
        }
       return palindrome;
    }

    private int getPalindromeRoot(String str, boolean isEvenDigits) {
        int strLen = str.length();
        String palindromeRoot = isEvenDigits ? str.substring(0, strLen / 2) : str.substring(0, strLen / 2 + 1);

        return Integer.parseInt(palindromeRoot);
    }

    private boolean isAllNine(String n) {
        for (char c: n.toCharArray()) {
            if (c != '9') {
                return false;
            }
        }

        return true;
    }
}


