class Solution{
    public List<Integer> pattern(int N){
        // code here
        List<Integer> list = new ArrayList<>();
        list.add(N);
        if(N<=0) return list;
        
        solve(list,N-5,true,N);
        return list;
    }
    
    void solve(List<Integer> list, int n, boolean flag, int k){
        list.add(n);
        if(flag && n>0) solve(list,n-5,flag,k);
        if(flag && n==0) solve(list,5,false,k);
        if(flag && n<0) solve(list,n+5,false,k);
        if(!flag && n>0 && n<k) solve(list,n+5,false,k);
        else return;
    }
}