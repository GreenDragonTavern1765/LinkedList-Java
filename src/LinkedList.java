public class LinkedList {
    // Main method, create myList, an instance of LinkedList class
    public static void main(String[] args) {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        for (int i = 1; i <= 10; i++)
            myList.pushNode(i * 10);
        myList.printListContents();
        myList.remove(10);
        myList.printListContents();
    }
}
