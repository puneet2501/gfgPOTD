class Solution {
  public:
    int romanToDecimal(string &str) {
        
        int ans = 0;
        int n = str.size();
        unordered_map<char, int> mpp;
        
        mpp['I'] = 1;
        mpp['V'] = 5;
        mpp['X'] = 10;
        mpp['L'] = 50;
        mpp['C'] = 100;
        mpp['D']= 500;
        mpp['M'] = 1000;
        
        
        ans += mpp[str[n-1]];
        for(int i = n-2; i >= 0; i--){
            char cur = str[i];
            char prev = str[i+1];
            
            if(mpp[cur] < mpp[prev]){
                ans  -= mpp[cur];
            } else {
                ans += mpp[cur];
            }
        }
        return ans;
    }
};