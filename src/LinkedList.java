public class LinkedList<E> {
    Node<E> head;   // Front of the linked list
    Node<E> tail;   // End of the linked list
    int size;       // Current size of the linked list

    // Linked List constructor, sets head and tail to null
    // Sets the size to 0 initially
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
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
}
