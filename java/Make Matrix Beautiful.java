class Solution {
    public static int findMinOperation(int n, int[][] matrix) {
        // code here
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum = sum + matrix[i][j];
            }
        }
        
        int rs = 0;
        int cs = 0;
        
        for(int i=0; i<n; i++){
            int a = 0;
            for(int j=0; j<n; j++){
                a = a+matrix[i][j];
            }
            rs = Math.max(rs,a);
            
            int b = 0;
            for(int j=0; j<n; j++){
                b = b + matrix[j][i];
            }
            cs = Math.max(cs,b);
        }
        
        int max = Math.max(cs,rs);
        
        return max*n-sum;
    }
}