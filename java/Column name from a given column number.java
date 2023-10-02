class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder sb = new StringBuilder();
        
        while(n-->0){
            sb.append((char)('A'+n%26));
            n = n/26;
        }
        
        return sb.reverse().toString();
    }
}