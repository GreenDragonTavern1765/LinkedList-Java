public class SingleLinkedList<E> {
    private Node<E> head;   // Front of the linked list
    private int size;       // Current size of the linked list

    // Linked List constructor, sets head and tail to null
    // Sets the size to 0 initially
    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Node class, will be called when creating a new node
    // Not available in the main method, can only be accessed indirectly
    private static class Node<E> {
        E item;
        Node<E> next;
        public Node(E item) {
            this.item = item;
        }
    }

    // Method will insert a new node at the front of the list
    // Modifies the head of the linked list
    public void pushNode(E data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        this.size++;
    }

    // Method appends a new node to the end of the linked list.
    // Uses node.next to traverse the list
    public void appendNode(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        } newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        this.size++;
        return;
    }

    // Function will print the contents of the list, starting from
    // the head of the list, using temp = temp.next instead of i++
    public void printListContents() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } Node temp = head;
        System.out.print("Nodes: ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        } System.out.println("\nSize of list: " + this.size );
    }

    // Method to remove a node at a given index
    // as well as decrement the size by 1
    // Uses the getNode() method to traverse the list
    // until given node index is found
    public void remove(int value) {
        Node temp = head;
        if (temp != null && temp.item.equals(value)) {
            head = temp.next;
        } Node prev = null;
        while (temp != null && !(temp.item.equals(value))) {
            prev = temp;
            temp = temp.next;
        } if (temp == null)
            return;
        prev.next = temp.next;
    }

    // Utility method - returns the size of the list
    // as size cannot be accessed in main
    public int getSize() {
        return this.size;
    }
}