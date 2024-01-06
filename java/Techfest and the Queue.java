class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        long sum = 0;
        
        for(int i=(int)a; i<=(int)b; i++){
            int x = i;
            for(int j=2; j*j<=x; j++){
                while(x%j==0){
                    sum++;
                    x=x/j;
                }
            }
            if(x>=2) sum++;
        }
        return sum;
    }
}
  