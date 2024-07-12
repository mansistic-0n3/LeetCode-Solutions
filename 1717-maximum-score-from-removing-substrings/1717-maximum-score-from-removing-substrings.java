import java.util.ArrayList;

class Solution {
    public int maximumGain(String s, int x, int y) {
        ArrayList<Character> st = new ArrayList<>();
        for (char c : s.toCharArray()) {
            st.add(c);
        }
        
        int count = 0;
        
        if (x > y) {
            count += calculateGain(st, 'a', 'b', x);
            count += calculateGain(st, 'b', 'a', y);
        } else {
            count += calculateGain(st, 'b', 'a', y);
            count += calculateGain(st, 'a', 'b', x);
        }
        
        return count;
    }
    
    private int calculateGain(ArrayList<Character> st, char first, char second, int value) {
        int count = 0;
        for (int i = 0; i < st.size() - 1; ) {
            if (st.get(i) == first && st.get(i + 1) == second) {
                count += value;
                st.remove(i + 1);
                st.remove(i);
                if (i > 0) {
                    i--; 
                }
            } else {
                i++;
            }
        }
        return count;
    }
}
