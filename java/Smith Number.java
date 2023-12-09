class Solution {
    static int smithNum(int n) {
        // code here
        if(digitSum(n)==primeFSum(n)) return 1;
        return 0;
    }
    
    static int primeFSum(int n){
        int count = 0, res = 0, i=2;
        while(n>1){
            if(n%i==0) count++;
            if(n%i==0){
                if(i>10) res += digitSum(i);
                else res = res + i;
                n = n/i;
            }
            else i++;
        }
        return count>1?res:0;
    }
    
    static int digitSum(int x){
        int res = 0;
        while(x!=0){
            res += x%10;
            x = x/10;
        }
        return res;
    }
};