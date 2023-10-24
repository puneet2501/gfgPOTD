class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        int arr[] = new int[n+1];
        arr[0] = 0;
        
        for(int i=0; i<n; i++){
            int min = (int)(1e9);
            for(int j=i; j>=0; j--){
                if(isPalindrome(j,i,str)){
                    int res = 1+arr[j];
                    min = Math.min(res,min);
                }
            }
            arr[i+1] = min;
        }
        return arr[n]-1;
        
    }
    
    static boolean isPalindrome(int i, int j, String str){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}