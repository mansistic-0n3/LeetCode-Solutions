class Solution {
    public String reverseVowels(String s) {        
        ArrayList<Character> a= new ArrayList<>();
        ArrayList<Character> vow= new ArrayList<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');
        for(int i =0; i<s.length(); i++){
            if(vow.contains(s.charAt(i))){
                a.add(s.charAt(i));
            }
        }
        Collections.reverse(a);
        StringBuilder str = new StringBuilder(s);
        int c=0;
        for(int i =0; i<str.length(); i++){
            if(vow.contains(s.charAt(i))){
                str.setCharAt(i,a.get(c));
                c++;
            }
        }
        return str.toString();
    }
}