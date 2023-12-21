class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        int arr[][] = new int[N][3];
        for(int i=0; i<N; i++){
            arr[i][0] = S[i];
            arr[i][1] = F[i];
            arr[i][2] = i+1;
        }
        
        Arrays.sort(arr,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        ArrayList<Integer> list = new ArrayList<>();
        int fin = -1;
        
        for(int i=0; i<N; i++){
            if(fin<arr[i][0]){
                fin = arr[i][1];
                list.add(arr[i][2]);
            }
        }
        
        Collections.sort(list);
        return list;
    }
}
     