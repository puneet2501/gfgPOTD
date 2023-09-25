class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // HashSet<ArrayList<Integer>> hs = new HashSet<>();
        
        for(int i=0; i<n; i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int s = j+1, e= n-1;
                
                while(s<e){
                    int sum = arr[i]+arr[j]+arr[s]+arr[e];
                    if(sum==k){
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[s],arr[e]));
                        // if(!hs.contains(l)){
                        //     list.add(l);
                        //     hs.add(l);
                        // }
                        list.add(l);
                        s++;e--;
                        while(s<e && arr[s]==arr[s-1]) s++;
                        while(s<e && arr[e]==arr[e+1]) e--;
                    }
                    else if(sum<k) s++;
                    else e--;
                }
            }
        }
        return list;
    }
}