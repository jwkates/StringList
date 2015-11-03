/* DList2.java */

/**
 * A DList2 is a mutable doubly-linked list.  Its implementation is
 * circularly-linked and employs a sentinel (dummy) node at the head
 * of the list.
 */

public class LinkedList<T> {

    /**
     * head references the sentinel node.
     * <p/>
     * DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
     */

    public LinkedListNode<T> head;
    public int size;

  /* DList2 invariants:
   *  1)  head != null.
   *  2)  For any DListNode2 x in a DList2, x.next != null.
   *  3)  For any DListNode2 x in a DList2, x.prev != null.
   *  4)  For any DListNode2 x in a DList2, if x.next == y, then y.prev == x.
   *  5)  For any DListNode2 x in a DList2, if x.prev == y, then y.next == x.
   *  6)  size is the number of DListNode2s, NOT COUNTING the sentinel
   *      (denoted by "head"), that can be accessed from the sentinel by
   *      a sequence of "next" references.
   */

    /**
     * DList2() constructor for an empty DList2.
     */
    public LinkedList() {
        head = new LinkedListNode<>();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    /**
     * DList2() constructor for a one-node DList2.
     */
    public LinkedList(T item) {
        this();
        head.next = new LinkedListNode<>(item);
        head.prev = head.next;
        head.next.prev = head;
        head.next.next = head;
        size = 1;
    }

    public T get(int index) {
        return getNthNode(index).item;
    }

    public void add(T item) {
        // The new item is inserted after the last node
        insertAfter(head.prev, item);
    }

    public void set(int index, T item) {
        LinkedListNode<T> nthNode = getNthNode(index);

        nthNode.item = item;
    }

    public void insert(int index, T item) {
        LinkedListNode<T> nthNode = getNthNode(index);

        insertBefore(nthNode, item);
    }

    public T remove(int index) {
        LinkedListNode<T> nthNode = getNthNode(index);
        T item = nthNode.item;

        removeNode(nthNode);

        return item;
    }


    private void insertAfter(LinkedListNode<T> node, T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);

        newNode.prev = node;
        newNode.next = node.next;

        node.next.prev = newNode;
        node.next = newNode;

        size++;
    }

    private void insertBefore(LinkedListNode<T> node, T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);

        newNode.prev = node.prev;
        newNode.next = node;

        node.prev.next = newNode;
        node.prev = newNode;

        size++;
    }

    private void removeNode(LinkedListNode<T> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;

        node.next = null;
        node.prev = null;
    }

    private LinkedListNode<T> getNthNode(int n) {
        LinkedListNode currentNode = head.next;

        for (int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * toString() returns a String representation of this DList.
     * <p/>
     * DO NOT CHANGE THIS METHOD.
     *
     * @return a String representation of this DList.
     */
    public String toString() {
        String result = "[  ";
        LinkedListNode current = head.next;
        while (current != head) {
            result += current.item + ", ";
            current = current.next;
        }
        return result + "]";
    }

    public static class LinkedListNode<T> {

        /**
         *  item references the item stored in the current node.
         *  prev references the previous node in the DList.
         *  next references the next node in the DList.
         *
         *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
         */

        public T item;

        public LinkedListNode<T> prev;
        public LinkedListNode<T> next;
        /**
         *  DListNode2() constructor.
         */
        public LinkedListNode() {
            this(null);
        }

        public LinkedListNode(T item) {
            this.item = item;

            prev = null;
            next = null;
        }
    }
}
