// Shortest path from 1 to n
class Solution{
    public int minStep(int n)
    {
        // code here
        int x = n; 
        int count = 0;
        while(x>1){
            count++;
            if(x%3!=0) x=x-1;
            else x=x/3;
        }
        return count;
    }
}
