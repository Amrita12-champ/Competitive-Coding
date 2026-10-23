class Node4 {
    int data;
    Node left, right;

    Node4(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeInsert {

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        System.out.print("Tree after insertions: ");
        inorder(root);
    }
}