class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);   
        root.left.right = new Node(50);  
        root.right.right = new Node(70); 
        root.right.left = new Node(60); 

        System.out.println("Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
        System.out.println("Left-Left Child: " + root.left.left.data);
        System.out.println("Left-Right Child: " + root.left.right.data);
        System.out.println("Right-Left Child: " + root.right.left.data);
        System.out.println("Right-Right Child: " + root.right.right.data);
    }
}
