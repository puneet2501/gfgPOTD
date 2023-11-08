class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int mat[][])
    {
        // code here 
        int n = mat.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i&1)==0) list.add(mat[i][j]);
                else list.add(mat[i][n-1-j]);
            }
        }
        return list;
    }
}