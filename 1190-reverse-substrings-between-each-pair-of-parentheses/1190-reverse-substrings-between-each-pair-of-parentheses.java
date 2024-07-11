class Solution {
    public String reverseParentheses(String s) {
        ArrayList<Integer> n = new ArrayList();
        char[] st = s.toCharArray();
        StringBuilder abc = new StringBuilder();
        for (int i = 0; i < st.length; i++) {
            if (st[i] == '(') {
                n.add(i);
            } else if (st[i] == ')') {
                int j = n.remove(n.size() - 1);
                int left = j + 1;
                int right = i - 1;
                while (left < right) {
                    char temp = st[left];
                    st[left] = st[right];
                    st[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        for (char c : st) {
            if (c != '(' && c != ')') {
                abc.append(c);
            }
        }
        return abc.toString();
    }
}