//linked lists in java
//these are data structures for storing a collection of items. they store things a bit differently to arrayLists.
//in essence, if you need fast, random access and the size of the list doesn't change often, ArrayList might be more suitable. If you have frequent insertions or deletions and the list size can vary, LinkedList might be a better choice.

public class Node<T> {
    T element;          // list element
    Node<T> next;       // successor link
    
    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
    
    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    @Override
    public String toString() {  
        return "<Element: " + element + ">";
    }
}
