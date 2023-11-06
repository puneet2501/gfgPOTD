class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int uts = 0, lts = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                uts+=matrix[i][j];
                lts+=matrix[j][i];
            }
        }
        list.add(uts);
        list.add(lts);
        return list;
    }
}