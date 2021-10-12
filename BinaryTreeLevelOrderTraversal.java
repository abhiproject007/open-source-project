public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        List<Integer> tempList = new ArrayList<Integer>();
        tempList.add(root.val);
        result.add(tempList);
        
        while(!queue.isEmpty()) {
            Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
            
            List<Integer> list = new ArrayList<Integer>();
            
            while(!queue.isEmpty()) {
                TreeNode current = queue.remove();
                
                if(current.left != null) {
                    currentLevel.add(current.left);
                    list.add(current.left.val);
                }
                
                if(current.right != null) {
                    currentLevel.add(current.right);
                    list.add(current.right.val);
                }
            }
           
    }
}
