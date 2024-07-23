class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> f = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(f.containsKey(nums[i])){
                f.put(nums[i],f.get(nums[i])+1);
            }else{
                f.put(nums[i],1);
            }
        }
        return sortByValueAndGetKeys(f,nums);
    }

    public static int[] sortByValueAndGetKeys(HashMap<Integer, Integer> hm, int[] nums) {
    // Convert the entries into a list
    List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());

    // Sort the list by values (frequency) in ascending order, and by keys in descending order if frequencies are equal
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            int valueComparison = o1.getValue().compareTo(o2.getValue()); // Ascending order by frequency
            if (valueComparison != 0) {
                return valueComparison;
            } else {
                return o2.getKey().compareTo(o1.getKey()); // Descending order by key if frequencies are equal
            }
        }
    });

    // Create an array to hold the sorted elements based on their frequencies
    List<Integer> resultList = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : list) {
        int value = entry.getKey();
        int frequency = entry.getValue();
        for (int i = 0; i < frequency; i++) {
            resultList.add(value);
        }
    }

    // Convert result list to an array
    int[] resultArray = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
        resultArray[i] = resultList.get(i);
    }

    return resultArray;
}

}