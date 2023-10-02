class Solution {
private:
    const int mod = 1000000007;

public:
    int distinctSubsequences(string S) {
        int n = S.length();
        vector<long long> arr(26, -1);

        long long ans = 0; // total number of distinct subsequences till (i-1)th character
        long long diff = 0; // total number of subsequences of the ith character

        for (int i = 0; i < n; i++) {
            int x = S[i] - 'a';
            if (i == 0) {
                ans = 1;
                arr[x] = 1;
                continue;
            }

            diff = 1 + ans;

            if (arr[x] == -1) ans = (ans + diff) % mod;
            else ans = (ans + diff - arr[x]) % mod;
            arr[x] = diff;
        }
        ans += 1;
        return (ans < 0 ? ans + mod : ans);
    }
};