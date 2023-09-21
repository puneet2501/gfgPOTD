class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        int li = bs1(arr,0,n-1,x);
        int ri = bs2(arr,0,n-1,x);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(li,ri));
        return list;
    }
    
    int bs1(int arr[], int l, int r, int x){
        int res = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]<x) l = m+1;
            else{
                if(arr[m]==x) res = m;
                r = m-1;
            }
        }
        return res;
    }
    
    int bs2(int arr[], int l, int r, int x){
        int res = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]>x) r = m-1;
            else {
                if(arr[m]==x) res = m;
                l = m+1;
            }
        }
        return res;
    }
    
}