class Solution{
    public:
    string colName (long long int n)
    {
        // your code here
        string s = "";
        while(n-->0){
            s+='A'+n%26;
            n=n/26;
        }
        reverse(s.begin(),s.end());
        return s;
    }
};
