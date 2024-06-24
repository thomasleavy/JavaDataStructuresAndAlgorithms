//linked lists in java
//these are data structures for storing a collection of items. they store things a bit differently to arrayLists.
//in essence, if you need fast, random access and the size of the list doesn't change often, ArrayList might be more suitable. If you have frequent insertions or deletions and the list size can vary, LinkedList might be a better choice.

public class SinglyLinkedList<T> {
    //create head and tail of linked list, and the size
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addAtIndex(int index, T element) {
        //add at beginning
        if (index == 0) {
            addToTheFront(element);
        }
        //add at ending
        else if (index == size) {
            addToTheBack(element);
        }
        //add at a specific index position
        else {
            Node<T> newNode = new Node<>(element);
            Node<T> current = head;

            //use for loop to iterate through to make sure you stop at the node just before the position you want the node in the linked list.
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            //insert the new added node
            newNode.next = current.next;
            current.next = newNode;

            size++;
        }
    }

    //add new node to the beginning of the linked list. if linked list is empty, the tail will become the head.
    private void addToTheFront(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    //add new node to the back of the linked list, use if statement to react if linked list is empty or if there's another node at tail end
    private void addToTheBack(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    //return current size of linked list
    public int size() {
        return size;
    }

    //check if linked list is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    //return head node
    public Node<T> getFirstNode() {
        return head;
    }

    //return tail node
    public Node<T> getLastNode() {
        return tail;
    }
}

