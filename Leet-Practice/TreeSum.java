class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeSum {
    public static int findSum(Node root){
        if(root==null){
            return 0;
        }
        return root.data + findSum(root.left) + findSum(root.right);

    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);

        int totalSum = findSum(root);
        System.out.println("Sum of all nodes: " + totalSum);

    }
}
