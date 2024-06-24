//A Doubly Linked List is a linear data structure. This is a sequential collection of elements.

package DoublyLinkedList;
public class DLLNode <T> {
    //class variables
    //list element
    T element;
    //previous link
    DLLNode <T> prev;
    //next link
    DLLNode <T> next;

    //constructors
    public DLLNode (T elem, DLLNode<T> p, DLLNode<T> n) {
        element = elem;
        prev = p;
        next = n;
    }

    public DLLNode (T elem) {
        this(elem, null, null);
    }

    //getters and setters
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    public DLLNode <T> getPrev() {
        return prev;
    }

    public void setPrev(DLLNode<T> prev) {
        this.prev = prev;
    }

    public DLLNode<T> getNext() {
        return next;
    }
    public void setNext(DLLNode<T> next) {
        this.next = next;
    }

    //toString Override method
    @Override
    public String toString() {
        return "DLLNode{" +
                "element=" + element +
                '}';
    }

}
