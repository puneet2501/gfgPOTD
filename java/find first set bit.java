class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n==0) return 0;
        int i = 1;
        while(n>0 && n%2==0){
            n = n/2;
            i++;
        }
        return i;
        
    }
}