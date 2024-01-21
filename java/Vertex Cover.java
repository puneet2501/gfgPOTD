class Solution {
    private int res;
    private ArrayList<int[]> list;

    private int count(ArrayList<Integer> vertex) {
        for (int[] v : list) {
            if (vertex.get(v[0] - 1) == 0 && vertex.get(v[1] - 1) == 0) return res;
        }
        int c = 0;
        for (int v : vertex) c += v;
        return c;
    }

    private void subset(int i, ArrayList<Integer> vertex) {
        if (i == vertex.size()) {
            int val = count(vertex);
            res = Math.min(val, res);
            return;
        }
        subset(i + 1, vertex);
        vertex.set(i, 1);
        subset(i + 1, vertex);
        vertex.set(i, 0);
    }

    public int vertexCover(int n, int m, int[][] edges) {
        list = new ArrayList<>();
        for (int[] e : edges) list.add(e);
        ArrayList<Integer> vertex = new ArrayList<>(n);
        for (int i = 0; i < n; i++) vertex.add(0);
        res = n;
        subset(0, vertex);
        return res;
    }
}