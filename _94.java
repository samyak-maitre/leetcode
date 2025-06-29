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
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    public void inorder(TreeNode r, List<Integer> l){
        if(r==null) return ;

        inorder(r.left, l);
        l.add(r.val);
        inorder(r.right, l);   
    }
}