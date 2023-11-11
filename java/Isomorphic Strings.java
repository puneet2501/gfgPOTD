class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;
        HashMap<Character,Character> hm = new HashMap<>();
        int arr[] = new int[26];
        
        for(int i=0; i<str1.length(); i++){
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            
            if(hm.containsKey(a)){
                if(!hm.get(a).equals(b)) return false;
            }
            else{
                if(arr[b-'a']==1) return false;
                arr[b-'a'] = 1;
                hm.put(a,b);
            }
        }
        return true;
    }
}