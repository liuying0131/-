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

        TreeNode root=construction(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode construction(int []pre,int startpre,int endpre,int in[],int startIn,int endIn){
        if(startpre>endpre||startIn>endIn){
            return  null;
        }
        TreeNode root=new TreeNode(pre[startpre]);//pre的第一个节点是根节点
        for(int i=startIn;i<=endIn;i++){
            if(in[i]==pre[startpre])//中序中找到root
            {
                root.left=construction(pre,startpre+1,startpre+i-startIn,in,startIn,i-1);
                root.right=construction(pre,startpre+i-startIn+1,endpre,in,i+1,endIn);
                break;
            }


        }
        return root;
    }

    public static void main(String[] args) {
        int pre[]={1,2,4,7,3,5,6,8};
        int in[]={4,7,2,1,5,3,8,6};
        exam6 exam=new exam6();
        System.out.println(exam.reConstructBinaryTree(pre,in));
    }

}

