package designpattern;

//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//    @Override
//    public String toString() {
//        return "TreeNode{" +
//                "val=" + val +
//                ", left=" + left +
//                ", right=" + right +
//                '}';
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {


    static int cnt = 0;


    public static void main(String[] args) {
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node7 = new TreeNode(7);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
//
//        node5.left = node3;
//        node5.right = node7;
//
//        node3.left = node2;
//        node3.right = node4;
//
//        node7.left = node6;
//        node7.right = node8;
//
//        TreeNode treeNode = KthNode(node5, 3);
//        System.out.println(treeNode);
//
//
        System.out.println("Hello World!");
        System.out.println(Integer.MIN_VALUE);
    }


//    /**
//     * 中序遍历出来的结果就是有序序列，如果中序遍历在层层返回的第k层更新返回结果（为第k小节点）
//     * 中序遍历的好理解，略过
//     * 关键点：
//     * A代码块个C代码块
//     * 这个A判断如果不加，那么返回结果B就会被right返回的null覆盖掉，最后返回的结果为null，中间返回的k小节点被覆盖掉了
//     * 同理，C判断如果不加，那么返回结果B就会被left返回的null覆盖掉，最后返回的结果为null，中间返回的k小节点被覆盖掉了
//     * 注：null结果来源于D
//     * @param pRoot
//     * @param k
//     * @return
//     */
//    static TreeNode KthNode(TreeNode pRoot, int k) {
//        if (pRoot != null) {
//            // 左子树
//            TreeNode left = KthNode(pRoot.left, k);
//            // A: 层层返回回溯结果（此时的左节点就是第k小的节点），left是B处的pRoot（上一层的返回）
//            if (left != null)
//                return left;
//
//            // 中
//            // B: 回溯计数
//            cnt++;
//            if (cnt == k)
//                return pRoot;// 一定不为null
//
//            // 右子树
//            TreeNode right = KthNode(pRoot.right, k);
//            // C: 层层返回回溯结果（此时的右节点就是第k小的节点），right是B处的pRoot（上一层的返回）
//            if (right != null)
//                return right;
//        }
//        // D: null从根节点层层返回
//        return null;
//    }


}
