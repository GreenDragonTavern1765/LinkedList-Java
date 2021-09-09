public class LinkedList<E> {
    Node<E> head;   // Front of the linked list
    Node<E> tail;   // End of the linked list
    int size;       // Current size of the linked list

    // Linked List constructor, sets head and tail to null
    // Sets the size to 0 initially
    public LinkedList() {
        this.head = null;
        this.tail = null;
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
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        } System.out.println();
    }

    // Method iterates through present nodes until index is found, returning
    // the node itself, private, must be accessed indirectly through another method
    private Node<E> getNode(int index) {
        Node<E> temp = head;
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(Integer.toString(index));
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp;
    }

    // Method to remove a node at a given index
    // as well as decrement the size by 1
    // Uses the getNode() method to traverse the list
    // until given node index is found
    public void remove(int index) {
        Node<E> node = getNode(index);
        Node<E> temp = node.next;
        if (temp.next != null) {
            node.next = temp.next;
            this.size--;
        }
    }

    // Main method, create myList, an instance of LinkedList class
    public static void main(String[] args) {
    }
}
