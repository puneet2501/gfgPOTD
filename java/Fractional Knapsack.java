/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,(a,b)->Double.compare(b.value*1.0/b.weight,a.value*1.0/a.weight));
        
        int wt = 0;
        double pf = 0.0;
        
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i].value + "  " +arr[i].weight);
        // }
        
        for(int i=0; i<n; i++){
            if(wt==W) break;
            
            int temp = arr[i].weight;
            if(temp<=W-wt) {
                pf += arr[i].value;
                wt += temp;
            }
            
            else{
                pf += (W-wt)*(arr[i].value*1.0/temp);
                wt = W;
            }
        }
        return pf;
    }
}