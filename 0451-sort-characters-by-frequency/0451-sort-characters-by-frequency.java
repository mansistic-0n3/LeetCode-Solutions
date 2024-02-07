class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[123];
        List<Character> list = new ArrayList<>();
        for(char c: s.toCharArray()){
            arr[(int)c]++;

            if(arr[(int)c] == 1){
                list.add(c);
            }
        }
        Collections.sort(list, (a,b) ->                 Integer.valueOf(arr[(int)b]).compareTo(Integer.valueOf(arr[(int)a])));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            while(arr[(int)c] > 0){
                sb.append(c);
                arr[(int)c]--;
            }
        }
        return sb.toString();
    }
}