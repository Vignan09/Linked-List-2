// Time complexity :O(1)
// Space Complexity :O(h)
class BSTIterator {
    Stack <TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        TreeNode node = root;
        dfs(node);

    }
    public int next() {
        TreeNode node = st.pop();
        dfs(node.right);
        return node.val;
    }
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void dfs(TreeNode node){
        while(node != null){
            st.push(node);
            node = node.left;
        }
    }
}
