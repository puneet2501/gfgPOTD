class Solution{
    static int [] row = {-1,0,1,0};
    static int [] col = {0,1,0,-1};
    
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if((i==0 || i==n-1 || j==0 || j==m-1) && a[i][j]=='O' && arr[i][j]==0){
                    makeOne(i,j,n,m,a,arr);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0) a[i][j] = 'X'; 
            }
        }
        return a;
    }
    
    static void makeOne(int i, int j, int n, int m, char [][] a, int [][] arr){
        arr[i][j] = 1;
        for(int k=0; k<4; k++){
            int r = i+row[k];
            int c = j+col[k];
            
            if(r>=0 && r<n && c>=0 && c<m && a[r][c]=='O' && arr[r][c]==0){
                makeOne(r,c,n,m,a,arr);
            }
        }
    }
}