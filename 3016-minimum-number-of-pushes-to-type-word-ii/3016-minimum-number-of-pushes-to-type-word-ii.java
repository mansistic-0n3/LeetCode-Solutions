class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap();
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        int sum = 0;
        int multiplier = 1;
        int count = 0;

        for (Map.Entry<Character, Integer> entry : list) {
            if (count % 8 == 0 && count != 0) {
                multiplier++;
            }
            sum += entry.getValue() * multiplier;
            count++;
        }

        return sum;
    }
}