class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int qr[][])
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<q; i++){
            list.add(hopSum(qr[i][1], qr[i][2], qr[i][0], mat, n, m));
        }
        return list;
        
    }
    
    static int hopSum(int i, int j, int h, int[][] mat, int n, int m){
        int sum = 0;
        
        int ur = i-h, dr = i+h, lc = j-h, rc = j+h;
        
        for(int k =lc; k<rc; k++) if(isValid(ur,k,n,m)) sum = sum + mat[ur][k];
        for(int k=ur; k<dr; k++)  if(isValid(k,rc,n,m)) sum = sum+mat[k][rc];
        for(int k=rc; k>lc; k--)  if(isValid(dr,k,n,m)) sum = sum +mat[dr][k];
        for(int k=dr; k>ur; k--)  if(isValid(k,lc,n,m)) sum = sum + mat[k][lc];
        return sum;
        
    }
    
    static boolean isValid(int r, int c, int n, int m){
        if(r>=0 && r<n && c>=0 && c<m) return true;
        return false;
    }
}