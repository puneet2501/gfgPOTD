class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        long arr[] = new long[n];
        for(int i=0; i<n; i++) arr[i] = price[i]*100000 + (i+1);
        
        Arrays.sort(arr);
        
        int count = 0;
        for(int i=0; i<n; i++){
            int day = (int)arr[i]%100000;
            int pr  = (int)arr[i]/100000;
            
            if(pr*day<=k){
                count+=day;
                k = k-pr*day;
            }
            else{
                count+=(k/pr);
                k = k-pr*(k/pr);
            }
        }
        return count;
    }
}