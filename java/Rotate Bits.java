class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        D = D%16;
        int l = (N<<D | N>>(16-D))&65535;
        int r = (N>>D | N<<(16-D))&65535;
        list.add(l);
        list.add(r);
        return list;
    }
}