public class CountNodes {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int countNodes() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur= cur.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNodes list = new CountNodes();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Num of nodes: " + list.countNodes());
    }
}
