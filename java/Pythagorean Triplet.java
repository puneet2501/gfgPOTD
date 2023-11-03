class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        ArrayList<Double> list = new ArrayList<>();
        // ArrayList<Integer> slist = new ArrayList<>();  ///
        
        for(int i=0; i<n; i++){
            if(!list.contains(Double.valueOf(arr[i]))){
                list.add(Double.valueOf(arr[i]));
                // slist.add(arr[i]*arr[i]);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                Double aa = list.get(i)*list.get(i);
                Double bb = list.get(j)*list.get(j);
                
                if(list.contains(Math.sqrt(aa+bb))) return true;
            }
        }
        
        return false;
    }
}