class Solution {
    long countStrings(int n) {
        // code here
        if(n==1) return 2;
        long one = 1, zero = 1, total = one+zero;
        
        while(n-->1){
            one = zero;
            zero = total;
            total = (one + zero)%1000000007;
        }
        
        return total%1000000007;
    }
}