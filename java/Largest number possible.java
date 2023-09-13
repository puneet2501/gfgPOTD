class Solution{
    static String findLargest(int N, int S){
        // code here
        if(S>9*N || (N!=1 && S==0)) return "-1";
        int a = S/9;
        int b = S%9;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a; i++){
            sb.append(9);
        }
        if(a<N){
            sb.append(b);
            for(int i=0; i<N-a-1; i++){
                sb.append(0);
            }
        }
        
        return sb.toString();
    }
}