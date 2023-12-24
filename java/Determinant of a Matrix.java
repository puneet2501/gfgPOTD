class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n)
    {
        // code here 
        if(n==1) return mat[0][0];
        if(n==2) return mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
        
        int det = 0;
        
        for(int i=0; i<n; i++){
            int cof = (int)Math.pow(-1,i)*mat[0][i]*determinantOfMatrix(sub(mat,0,i),n-1);
            det = det + cof;
        }
        return det;
    }
    
    static int[][] sub(int[][] mat, int r, int c){
        int n = mat.length;
        int arr[][] = new int[n-1][n-1];
        
        int row=0, col =0;
        for(int i=0; i<n; i++){
            if(i!=r){
                for(int j=0; j<n; j++){
                    if(j!=c){
                        arr[row][col] = mat[i][j];
                        col++;
                    }
                }
                col = 0;
                row++;
            }
        }
        return arr;
    }
}
