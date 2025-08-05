import java.util.Arrays;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BST {

    Node root;
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search for a node in the BST
    boolean search(Node root, int key) {
        if (root == null) return false;

        if (key == root.data) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // Delete a node from the BST
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            Node inorderSuccessor = findMin(root.right);
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }

        return root;
    }

    // Find minimum value node in right subtree (used in delete)
    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Inorder traversal: prints tree in sorted order
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main method to test all operations
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }
        System.out.println("The inserted node values:"+Arrays.toString(values));

        System.out.print("Inorder before deletion: ");
        tree.inorder(tree.root);
        System.out.println();

        // Search nodes
        System.out.println("Search 60: " + tree.search(tree.root, 60)); // true
        System.out.println("Search 25: " + tree.search(tree.root, 25)); // false

        // Delete a node
        tree.root = tree.delete(tree.root, 50); // delete root (50)
        System.out.print("Inorder after deleting 50: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
