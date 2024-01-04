class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int res = 0;
        for(int i=0; i<32; i++){
            int setbit=0;
            for(int j=0; j<N; j++){
                if(((arr[j])&(1<<i))!=0) setbit++;
            }
            if(setbit%3==1){
                res = res | (1<<i);
            }
        }
        return res;
    }
}