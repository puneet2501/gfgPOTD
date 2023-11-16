class Solution{
    public String findString(int n, int k){
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<n; i++) sb.append(0);
       
       Set<String> set = new HashSet<>();
       set.add(sb.toString());
       
       int i = k-1;
       
       StringBuilder curr = sb;
       
       while(true){
           StringBuilder temp = new StringBuilder(curr.substring(1));
           temp.append((char)(i+'0'));
           
           if(!set.contains(temp.toString())){
               set.add(temp.toString());
               sb.append((char)(i+'0'));
               curr = temp;
               i = k-1;
           }
           else i--;
           if(i<0) break;
       }
    //   System.out.println(sb);
       return sb.toString();
    }
}