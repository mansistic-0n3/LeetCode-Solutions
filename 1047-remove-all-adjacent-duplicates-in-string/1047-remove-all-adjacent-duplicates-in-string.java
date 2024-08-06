class Solution {
    public String removeDuplicates(String s) {
        List<Character> ch = new ArrayList<>();
        for (char c : s.toCharArray()) {
            ch.add(c);
        }
        for(int i=0; i<ch.size()-1; i++){
            if(ch.get(i)==ch.get(i+1)){
                ch.remove(i);
                ch.remove(i);
                i=-1;
            }
        } StringBuilder sb = new StringBuilder();
        for (Character c : ch) {
            sb.append(c);
        }
        return sb.toString();
    }
}

// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder sb = new StringBuilder();
//         for (char c : s.toCharArray()) {
//             if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
//                 sb.deleteCharAt(sb.length() - 1);
//             } else {
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
//     }
// }
