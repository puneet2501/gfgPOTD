class Solution{
    static String matrixChainOrder(int p[], int n){
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        
        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }

        
        return ans(s, 1, n - 1);
    }

    static String ans(int[][] s, int i, int j) {
        if (i == j) {
            return String.valueOf((char)('A' + i - 1)); 
        } else {
            return "(" + ans(s, i, s[i][j]) + ans(s, s[i][j] + 1, j) + ")";
        }
    }
}

