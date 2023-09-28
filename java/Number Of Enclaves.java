class Solution {
    
    static int row [] = {-1,0,1,0};
    static int col[] = {0,1,0,-1};
    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int n = grid.length, m = grid[0].length, count = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1){
                    makeZero(i,j,n,m,grid);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1) count++;
            }
        }
        
        return count;
    }
    
    static void makeZero(int i, int j, int n, int m, int[][] grid){
        grid[i][j]=0;
        
        for(int k=0; k<4; k++){
            int r = i+row[k];
            int c = j+col[k];
            
            if(r>=0 && c>=0 && r<n && c<m && grid[r][c]==1){
                makeZero(r,c,n,m,grid);
            }
        }
        
    }
}