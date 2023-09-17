class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        while(n>1 && n%2==0){
            n = n/2;
        }
        return n==1?true:false;
    }
}