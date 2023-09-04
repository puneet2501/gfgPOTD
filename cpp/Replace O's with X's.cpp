class Solution {
public:
    std::vector<std::vector<char>> fill(int n, int m, std::vector<std::vector<char>>& mat) {
        // Define directions for neighboring cells (up, right, down, left)
        std::vector<int> row = {-1, 0, 1, 0};
        std::vector<int> col = {0, 1, 0, -1};
        
        // Traverse the border and mark connected 'O' cells as '1'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && mat[i][j] == 'O') {
                    makeOne(i, j, n, m, mat);
                }
            }
        }
        
        // Replace remaining 'O's with 'X' and restore '1's to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = 'X'; // Replace 'O' with 'X'
                } else if (mat[i][j] == '1') {
                    mat[i][j] = 'O'; // Restore '1' back to 'O'
                }
            }
        }
        
        return mat;
    }
    
    void makeOne(int i, int j, int n, int m, std::vector<std::vector<char>>& mat) {
        if (i < 0 || i >= n || j < 0 || j >= m || mat[i][j] != 'O') {
            return;
        }
        mat[i][j] = '1'; // Mark as visited
        std::vector<int> row = {-1, 0, 1, 0};
        std::vector<int> col = {0, 1, 0, -1};
        for (int k = 0; k < 4; k++) {
            makeOne(i + row[k], j + col[k], n, m, mat);
        }
    }
};