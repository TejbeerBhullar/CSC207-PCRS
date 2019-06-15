
public class SimpleLinkedList {
    private Node first;

    /**
     * Null constructor for SimpleLinkedList.
     */
    public SimpleLinkedList() {
        first = null;
    }

    /**
     * Constructor for SimpleLinkedList.
     *
     * @param elements a list of elements to build the LinkedList from
     */
    public SimpleLinkedList(Object[] elements) {
        if (elements.length > 0) {
            first = new Node();
            Node curr = first;
            for (int i = 0; i < elements.length; i++) {
                curr.value = elements[i];
                if (i < (elements.length - 1)) {
                    curr.next = new Node();
                }
                curr = curr.next;
            }
        }
    }

    /**
     * Returns the Node of the first element in the LinkedList.
     *
     * @return the Node of the first element.
     */
    public Node getFirst() {
        return first;
    }
    //Complete the function getLastValue such that it returns the Object in the last element of the
    // SimpleLinkedList, or null, if there are no elements.

    /**
     * Returns the value of the last element in the LinkedList.
     *
     * @return the value of the last element as an Object.
     */
    public Object getLastValue() {
        Node last;
        if (getFirst() == null) {
            return null;
        } else {
            int i = 0;

            Node currentNode = first;
            last = first;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                last = currentNode;

            }

        }
        return last.value;

    }
}
