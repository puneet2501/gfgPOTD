class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int step = 0;
        while(n!=0){
            if(n%2==0) n = n/2;
            else n = n-1;
            step++;
        }
        return step;
    }
}