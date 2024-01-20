class Solution
{
    static int totalMoves;

    public static int distributeCandy(Node root) {
        totalMoves = 0;
        distribute(root);
        return totalMoves;
    }

    private static int distribute(Node node) {
        if (node == null) return 0;
        int left = distribute(node.left);
        int right = distribute(node.right);
        totalMoves += Math.abs(left) + Math.abs(right);
        return node.data - 1 + left + right;
    }
}