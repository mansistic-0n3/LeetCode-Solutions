class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int digit = 1; digit <= 9; digit++) {
            ans(low, high, digit, result);
        }

        Collections.sort(result);
        return result;
    }

    private void ans(int low, int high, int current, List<Integer> result) {
        if (current > high) {
            return;
        }

        if (current >= low) {
            result.add(current);
        }

        int lastDigit = current % 10;

        if (lastDigit < 9) {
            ans(low, high, current * 10 + lastDigit + 1, result);
        }
    }
}