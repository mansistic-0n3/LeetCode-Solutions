class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map= new HashMap();
        HashSet<String> set = new HashSet<>();
        String[] input = s.split(" ");
        if(input.length!=pattern.length()){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                String store=map.get(pattern.charAt(i));
                if(!input[i].equals(store)){
                System.out.println(store+" : "+input[i]);
                    return false;
                }
            }else{
                if (set.contains(input[i])) {
                    return false;
                }
                set.add(input[i]);
                map.put(pattern.charAt(i), input[i]);
            }
        }
        return true;
    }
}