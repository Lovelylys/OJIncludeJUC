import com.sun.org.apache.regexp.internal.REUtil;

/**
 * @author abs
 * @Date 2019/8/12 - 21:46
 */
public class HasSubtree {
    public static void main(String[] args) {

    }
    public static boolean hasSubTree(TreeNode2 root1,TreeNode2 root2){
        if(root2 == null || root1==null){
            return false;
        }
        boolean flag = search(root2,root1);
        return flag;
    }
    public static boolean preOrder(TreeNode2 root2,TreeNode2 node){
        if(node == null){
            return false;
        }else if(root2.val != node.val){
            return false;
        }
        boolean flag = true;
        if(root2.left != null){
            flag = preOrder(root2.left,node.left);
        }
        if(!flag){
            return flag;
        }
        if(root2.right != null){
            flag = preOrder(root2.right,node.right);
        }
        return flag;
    }
    public static boolean search(TreeNode2 root2,TreeNode2 root1){
        boolean flag = preOrder(root2,root1);
        if(flag){
            return flag;
        }
        flag = false;
        if(root1.left != null){
            flag = search(root2,root1.left);
        }
        if(flag){
            return flag;
        }
        if(root1.right != null){
            flag = search(root2,root1.right);
        }
        return flag;
    }
}
class TreeNode2{
    int val = 0;
    TreeNode2 left = null;
    TreeNode2 right = null;

    public TreeNode2(int val) {
        this.val = val;

    }
}
