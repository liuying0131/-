import javax.swing.event.TreeExpansionEvent;

class TreeNode {
    int val;
    TreeNode left;  //左右孩子
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class exam6 {
    /*
    根据中序、前序构建二叉树
    递归
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=new TreeNode(pre[0]);//根节点

        if(root==null){
            return null;
        }
        return  ConstructBinaryTree(pre,)

    }
    public TreeNode construction(itn []pre.int ps,int ps,int pre)

    public static void main(String[] args) {
        int pre[]={};
        int in[]={};
        exam6 exam=new exam6();
        System.out.println(exam.reConstructBinaryTree(pre,in));
    }

}

