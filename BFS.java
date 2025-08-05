import java.util.LinkedList;
import java.util.Queue;

// Define the Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Main class with BFS implementation
public class BFS {

    // BFS (Level-order traversal)
    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("BFS traversal: ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Build the tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        bfs(root); // Perform BFS
    }
}
