class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LeafNodes {
    public static void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }
        if(root.left==null && root.right==null){
            System.out.println(root.data + " ");
            return;

        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);

    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        System.out.print("Leaf nodes: ");
        printLeafNodes(root);
    }
}
