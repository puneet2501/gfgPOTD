class Solution{
    static int numberSequence(int m, int n)
    {
        // code here
        if(m < n)return 0;
        if(n==0)return 1;
        return numberSequence(m-1,n)+numberSequence((m>>1),n-1);
    }
}