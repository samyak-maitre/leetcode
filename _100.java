import java.util.*;

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
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}