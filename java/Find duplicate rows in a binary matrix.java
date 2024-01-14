class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<m; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(matrix[i][j]);
            }
            String row = sb.toString();
            if(set.contains(row)) list.add(i);
            else set.add(row);
        }
        return list;
    }
}