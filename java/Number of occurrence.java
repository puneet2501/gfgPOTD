class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int left_index = bsli(arr,0,n-1,x);
        int right_index = bsri(arr,0,n-1,x);
        
        return right_index - left_index;
    }
    
    int bsli(int[] arr, int l, int r, int x){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>=x) r = mid-1;
            else l = mid+1;
        }
        return r;
    }
    int bsri(int [] arr, int l, int r, int x){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<=x) l = mid+1;
            else r = mid-1;
        }
        return r;
    }
}