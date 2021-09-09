// Double Linked List Class
public class DoubleLinkedList<E> {
    Node<E> head;       // The front of the list
    Node<E> tail;       // The back of the list
    int size;           // The current size of the list

    // Double linked list constructor, initialize the head
    // and tail to point to null, and the size to 0
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Class to create each Node, in a double linked list
    // the Node will point to the next node and the prev node
    // It will also store the data
    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;
        // Constructor for a node, setting the data when created
        public Node (E data) {
            this.data = data;
        }
    }

    // Appends a node to the end of the list, faster than single linked list
    // as the tail is known, no need to traverse, takes up more memory though
    public void appendNode(int item) {
        Node newNode = new Node(item);      // Create a new node
        if (head == null) {                 // If list is empty
            head = tail = newNode;          // Head and tail will be new node
            head.prev = null;               // Head prev is nothing
            tail.next = null;               // Tail next is nothing
        } else {                            // Otherwise, if list is not empty
            tail.next = newNode;            // Tail points to new node
            newNode.prev = tail;            // New node prev points to tail
            tail = newNode;                 // Make new node the new tail
            tail.next = null;               // New tail next points to null
        } this.size++;
    }

    // Prints the contents of the list, if list is empty
    // print message and exit, otherwise traverse and print
    // each node in the linked list
    public void printAllNodes() {
        if (head == null) {                                         // If head is null, then the list is empty
            System.out.println("Double Linked List is empty");      // Print that list is empty
            return;                                                 // Return from method
        } System.out.print("Nodes: ");                              // Otherwise, print prompt
        Node temp = head;                                           // Create temp node, start at head (front)
        while (temp != null) {                                      // While temp node is not null (not end of list)
            System.out.print(temp.data + " ");                      // Print the temp node data
            temp = temp.next;                                       // Go to the next node
        } System.out.println("\nSize of list: " + this.size);
    }
}
