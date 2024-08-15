class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count=0;
        Map<Integer, Integer> map= new HashMap();
        for(int i=0; i<bills.length; i++){
            count+=5;
            if(bills[i]==5){
                map.put(5, map.getOrDefault(5, 0) + 1);
            }else{
                map.put(bills[i],  map.getOrDefault(bills[i], 0) + 1);
                // System.out.println(bills[i]-5+"one");
                map.put(5, map.getOrDefault(5, 0) - 1);
                if((bills[i]-5)>5){
                    // System.out.println("pending");
                    if(map.getOrDefault(10, 0) > 0){
                        map.put(10, map.get(10) - 1);
                    // System.out.println("ten");
                    }else if(map.getOrDefault(5, 0) >= 2){
                        map.put(5, map.get(5) - 2);
                    // System.out.println("Five");
                    }else{
                        return false;
                    }
                }
            }
            if(map.getOrDefault(5, 0)<0)return false;
        }
        return true;
    }
}