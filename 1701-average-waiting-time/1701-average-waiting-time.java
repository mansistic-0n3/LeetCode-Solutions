class Solution {
    public double averageWaitingTime(int[][] customers) {
        double count = 0;
        double total = 0;
        double sum = 0;
        double avg = 0.0;
        for(int i=0; i<customers.length; i++){
            if(i==0){
                count = customers[0][0]+customers[0][1];
            }else{
                if(count>customers[i][0]){
                    count=count+customers[i][1];
                }else{
                    count = customers[i][0]+customers[i][1];
                }
            }
            total = count - customers[i][0];
            sum=sum+total;
        }
        avg=sum/customers.length;
        return avg;
    }
}