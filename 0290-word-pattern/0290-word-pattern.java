class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Map to store the relationship between pattern characters and words
        HashMap<Character, String> map = new HashMap<>();
        
        // Set to track words that have already been mapped
        HashSet<String> set = new HashSet<>();
        
        // Split the input string into an array of words
        String[] input = s.split(" ");
        
        // Check if the number of words matches the length of the pattern
        if (input.length != pattern.length()) {
            return false;
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                // Check if the current word matches the previously mapped word for this character
                if (!input[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                // If the word is already mapped to another character, return false
                if (set.contains(input[i])) {
                    return false;
                }
                // Map the character to the current word and add the word to the set
                set.add(input[i]);
                map.put(pattern.charAt(i), input[i]);
            }
        }
        
        return true;
    }
}
