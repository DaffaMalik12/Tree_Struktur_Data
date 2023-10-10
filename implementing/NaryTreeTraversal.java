import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Kelas untuk merepresentasikan node dalam pohon N-ary
class TreeNode {
    int data;
    List<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class NaryTreeTraversal {

    // Fungsi untuk mencetak pohon N-ary secara PreOrder
    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            for (TreeNode child : root.children) {
                preOrderTraversal(child);
            }
        }
    }

    // Fungsi untuk mencetak pohon N-ary secara PostOrder
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            for (TreeNode child : root.children) {
                postOrderTraversal(child);
            }
            System.out.print(root.data + " ");
        }
    }

    // Fungsi untuk mencetak pohon N-ary secara LevelOrder
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            for (TreeNode child : current.children) {
                queue.offer(child);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.children.add(node4);
        root.children.add(node5);
        node4.children.add(node2);
        node4.children.add(node3);
        node5.children.add(node6);
       

        System.out.println("PreOrder traversal: ");
        preOrderTraversal(root);
        System.out.println();

        System.out.println("PostOrder traversal: ");
        postOrderTraversal(root);
        System.out.println();

        System.out.println("LevelOrder traversal: ");
        levelOrderTraversal(root);
        System.out.println();
    }
}
