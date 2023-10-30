class Solution {
    public long sumXOR (int arr[], int n) {
        long sum = 0;
        
        for(int i = 0; i < 32; i++) {
            long zc = 0, oc = 0;
            
            for(int j = 0; j < n; j++) {
                if(arr[j] % 2 == 0)
                    zc++;
                else
                    oc++;
                    
                arr[j] /= 2;
            }
            
            sum += zc * oc * (1 << i);
        }
        
        return sum;
    }
}
