class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length(); i++){
            st.push(num++);
            if(S.charAt(i)=='I'){
                while(!st.empty()) sb.append(st.pop());
            }
        }
        st.push(num++);
        while(st.size()>0) sb.append(st.pop());
        
        return sb.toString();
    }
}
