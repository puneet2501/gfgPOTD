class Solution {
    int countX(int L, int R, int X) {
        // code here
        int count = 0;
        int num = 0;
        
        for(int i=L+1; i<R; i++){
            num = i;
            while(num!=0){
                if(num%10==X) count++;
                num = num/10;
            }
        }
        return count;
    }
};