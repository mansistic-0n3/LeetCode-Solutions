class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int s = chalk.length;
        if(s==1){
            return 0;
        }
        int i=0;
        while(k>=chalk[i]){
            k-=chalk[i];
            if(i==s-1){
                i=i%(s-1);
            } else {
                i++;
            }
        }
        return i;
    }
}