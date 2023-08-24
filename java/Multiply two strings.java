class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        int n1=s1.length();
        int n2 = s2.length();
        int a = s1.charAt(0)=='-'?-1:0;
        int b = s2.charAt(0)=='-'?-1:0;
        
        int arr[] =  new int[n1+n2];
        for(int i=n1-1; i>=0; i--){
            int k = i+n2;
            if(s1.charAt(i)!='-'){
                int carry = 0;
                for(int j=n2-1; j>=0; j--){
                    if(s2.charAt(j)!='-'){
                        
                        int x = (s1.charAt(i)-'0')*(s2.charAt(j)-'0') + carry + arr[k];
                        arr[k] = x %10;
                        carry = x/10;
                        k--;
                    }
                }
                if(carry>0){
                    arr[k] = carry;
                }
            }
        }
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n1+n2; i++){
            while(i<n1+n2 && flag==true && arr[i]==0){
                i++;
            }
            flag =false;
            if(i<n1+n2) sb.append(arr[i]);
        }
        String str = sb.toString();
        if(a<0 && b>=0 || a>=0 && b<0) str = "-"+str;
        if(str.length()==0) return "0";
        return str;
    }
}