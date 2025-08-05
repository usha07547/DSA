class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class CountLeaf {
    static int countLeafNodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Number of leaf nodes: " + countLeafNodes(root));
}
}
