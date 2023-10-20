class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        long sum = 0;
        for(int x:arr) sum+=x;
        if(sum%3==0) return 1;
        return 0;
    }
}