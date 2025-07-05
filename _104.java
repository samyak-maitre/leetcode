class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int v){
        this.val = v;
    }
    TreeNode(int v, TreeNode l, TreeNode r){
        this.val = v;
        this.left = l;
        this.right = r;
    }
}

class Solution{
    public int maxDepth(TreeNode root){
        if(root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) +1;
    }
}