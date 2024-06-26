package LinkedListQueue;

public class Node<T> {
    T info;
    Node<T> next;

    public Node(T info) {
        this.info = info;
        this.next = null;
    }
}
