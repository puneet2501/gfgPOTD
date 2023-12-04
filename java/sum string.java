class Solution{
    public int isSumString(String S){
        // code here
        for(int i=1; i<S.length(); i++){
            for(int j=1; j<S.length()-i; j++){
                if(check(S,0,i,j)) return 1;
            }
        }
        return 0;
    }
    
    public boolean check(String str, int b, int n, int m){
        String s1 = str.substring(b,b+n);
        String s2 = str.substring(b+n,b+n+m);
        String s3 = sum(s1,s2);
        
        if(s3.length()>str.length()-b-n-m) return false;
        if(s3.equals(str.substring(b+n+m,b+n+m+s3.length()))){
            if(s3.length()==str.length()-b-n-m) return true;
            return check(str,b+n, m, s3.length());
        }
        return false;
    }
    
    public String sum(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i=s1.length()-1, j=s2.length()-1, sum=0, carry=0, rem=0;
        
        while(i>=0 || j>=0 || carry==1){
            sum = (i>=0?s1.charAt(i)-'0':0)+(j>=0?s2.charAt(j)-'0':0)+carry;
            rem = sum%10;
            i--; j--;
            carry = sum/10;
            sb.append(rem);
        }
        sb.reverse();
        return sb.toString();
    }
}
