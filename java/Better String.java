class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
        int res1 = distinctSubsequences(str1);
        int res2 = distinctSubsequences(str2);
        // System.out.println(res1+" "+res2);
        if(res1>=res2) return str1;
        return str2;
        
    }
    
    static int distinctSubsequences(String S) {
        // code here
        int n = S.length();
        int arr[] = new int[26];
        Arrays.fill(arr,-1);
        int ans = 0, diff = 0; 
        
        for(int i=0; i<n; i++){
            int x = S.charAt(i)-'a';
            if(i==0){
                ans = 1;
                arr[x] =1;
                continue;
            }
            diff = 1+ans;
            if(arr[x]==-1) ans = ans+diff;
            else ans = ans+diff-arr[x];
            arr[x] = diff;
        }
        return ans+1;
    }
}