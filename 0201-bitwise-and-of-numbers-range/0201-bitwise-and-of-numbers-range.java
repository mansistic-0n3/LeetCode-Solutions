class Solution {
    public int rangeBitwiseAnd(int left, int right) {
          int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}

// Here's how the code works with an example:

// Let's take left = 5 and right = 7.

// Convert left and right to binary:

// left = 5 in binary is 101.
// right = 7 in binary is 111.
// Now, we iterate through a loop until left becomes greater than or equal to right.

// In the first iteration:
// left = 101 >> 1 becomes 10 (which is 2 in decimal).
// right = 111 >> 1 becomes 11 (which is 3 in decimal).
// shift becomes 1.
// In the second iteration:
// left = 10 >> 1 becomes 1 (which is 1 in decimal).
// right = 11 >> 1 becomes 1 (which is 1 in decimal).
// shift becomes 2.
// Now, left is equal to right and we exit the loop.

// Finally, we left-shift left by shift bits and return the result:

// left << shift becomes 1 << 2 which is 100 (which is 4 in decimal).
// So, the bitwise AND of all numbers in the range [5, 7] is 4.