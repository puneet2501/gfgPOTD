class Solution {
public:
    int Count(vector<vector<int>>& matrix) {
        int ans = 0;
        
        vector<int> row = {-1, -1, 0, 1, 1, 1, 0, -1};
        vector<int> col = {0, 1, 1, 1, 0, -1, -1, -1};
        int n = matrix.size();
        int m = matrix[0].size();
        
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix[0].size(); j++) {
                int count = 0;
                if (matrix[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int r = i + row[k];
                        int c = j + col[k];
                        
                        if (r >= 0 && r < n && c >= 0 && c < m && matrix[r][c] == 0) {
                            count++;
                        }
                    }
                    if (count > 0 && count % 2 == 0) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

};