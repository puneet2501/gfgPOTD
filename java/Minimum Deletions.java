class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        int arr[][] = new int[n+1][n+1];
        StringBuilder s = new StringBuilder(S);
        s.reverse();
        
        for(int i=n; i>=0; i--){
            for(int j=n; j>=0; j--){
                if(i==n || j==n) arr[i][j] = 0;
                else if(S.charAt(i)==s.charAt(j)) arr[i][j] = 1+arr[i+1][j+1];
                else arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
            }
        }
        
        return n-arr[0][0];
    }
}