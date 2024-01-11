class Solution {
    public String removeKdigits(String S, int k) {
        // code here
        StringBuilder ans = new StringBuilder();
        
        for (char ch : S.toCharArray()) {
            while (ans.length() > 0 && ans.charAt(ans.length() - 1) > ch && k > 0) {
                ans.deleteCharAt(ans.length() - 1);
                k--;
            }
            if (ans.length() > 0 || ch != '0') {
                ans.append(ch);
            }
        }
        
        while (ans.length() > 0 && k > 0) {
            ans.deleteCharAt(ans.length() - 1);
            k--;
        }
        
        if (ans.length() == 0) {
            return "0";
        }
        
        return ans.toString();
    }
}