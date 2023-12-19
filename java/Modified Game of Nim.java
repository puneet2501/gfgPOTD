class Solution{
    static int findWinner(int n, int A[]){
        // code here
        if(n%2==0) return 1;
        int val = 0;
        for(int x : A){
            val = val^x;
        }
        if(val==0) return 1;
        return 2;
    }
}