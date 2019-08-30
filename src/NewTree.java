/**
 * @author abs
 * @Date 2019/8/7 - 23:32
 */

import com.sun.org.apache.regexp.internal.REUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewTree {
    public static void main(String[] args) {

    }
//    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        TreeNode root = new TreeNode(pre[0]);
//        root = reConstructBinaryTree(pre,in,0,pre.length-1,0,in.length-1);
//    }

    public static TreeNode reConstructBinaryTree(int[] pre,int[] in,int preStart,int preEnd,int inStart,int inEnd){
        if(inStart > inEnd || preStart > preEnd){
            return null;
        }
        TreeNode node = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if(pre[preStart] == in[i]){
                node.left = reConstructBinaryTree(pre,in,preStart+1,preStart+i-inStart,inStart,i-1);
                node.right = reConstructBinaryTree(pre,in,preStart+i+1-inStart,preEnd,i+1,inEnd);
                break;
            }
        }
        return node;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
