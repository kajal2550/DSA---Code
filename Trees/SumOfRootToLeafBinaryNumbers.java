// Problem: Sum of Root to Leaf Binary Numbers
// Platform: LeetCode
// Approach: DFS (Depth First Search)
// Time Complexity: O(N)
// Space Complexity: O(H)

class Solution {

    public int sumRootToLeaf(TreeNode root) {
        return DFS(root, 0);
    }

    public int DFS(TreeNode rt, int x) {
        if (rt == null) return 0;

        // Convert binary path to decimal
        x = x * 2 + rt.val;

        // If leaf node, return the computed value
        if (rt.left == null && rt.right == null) 
            return x;

        return DFS(rt.left, x) + DFS(rt.right, x);
    }
}
