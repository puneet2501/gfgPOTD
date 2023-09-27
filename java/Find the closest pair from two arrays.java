class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,-1));
        int i=0, j=m-1;
        int diff = (int)1e9;
        
        while(i<n && j>=0){
            int sum = arr[i]+brr[j];
            if(abs(sum,x)<diff){
                diff = abs(sum,x);
                list.set(0,arr[i]);
                list.set(1,brr[j]);
            }
            if(sum<x) i++;
            else j--;
        }
        return list;
    }
    static int abs(int a, int b){
        if(a>b) return a-b;
        return b-a;
    }
}

