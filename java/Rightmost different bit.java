
//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        // Your code here      
        if(m==n) return -1;
        int pos = 1;
        int x = m^n;
        while((x&1)!=1){
            pos++;
            x/=2;
        }
        return pos;
    }
}
