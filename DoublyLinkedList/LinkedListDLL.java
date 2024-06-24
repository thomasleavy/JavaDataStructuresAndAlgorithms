//A Doubly Linked List is a linear data structure. This is a sequential collection of elements.

package DoublyLinkedList;
public class LinkedListDLL <T> {
    DLLNode <T> first;
    DLLNode <T> last;

    //Constructor
    public LinkedListDLL() {
        first = null;
        last = null;
    }

    //this method checks if current list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //this method checks if the current list is empty, if not it returns the size
    public int size() {
        if(isEmpty()) {
            return 0;
        }
        //set it to 1 cos I'm counting backwards from the last
        int count = 1;
        DLLNode <T> current = last;
        //increment the count until I get to the first node
        //first.pre == null;
        while(current.prev != null) {
            current = current.prev;
            count++;
        }
        return count;
    }

    //this method adds an element to the end of the current list
    public void add(T elem) {
        //check if linked list is already empty. if it is, I add this element as the one and only elemenet, so first = last.
        if (first == null) {
            first = new DLLNode <T> (elem);
            last = first;
        }
        //else the LL is not empty. the current last node should point to this element and the newly inserted node, becomes the last element
        else {
            //here, last.next sets the (OLD) last to point to this new node new DLNode<T>(elem, last, null)... this is the DLNode constructor
            last.next = new DLLNode <T> (elem, last, null);
            last = last.next;
        }
    }

    public void add(int index, T elem) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            prepend(elem);
        } else if (index == size()) {
            add(elem);
        } else {
            DLLNode<T> pred = first;
            for (int i = 0; i < index - 1; i++) {
                pred = pred.getNext();
            }
            DLLNode<T> succ = pred.getNext();
            DLLNode<T> newNode = new DLLNode<>(elem, pred, succ);
            pred.setNext(newNode);
            succ.setPrev(newNode);
        }
    }

    //this method adds an element to the start of the current list
    public void prepend(T elem) {
        //if list is currently empty, then simply re-use the previously coded add(elem) method
        if(isEmpty()) {
            add(elem);
        }
        else {
            //I must add the new element to the start of the list
            first = new DLLNode<T> (elem, null, first);
            //create the backward link from the (OLD) first to the new first
            first.next.prev = first;
        }
    }
    //this method removes an element from the specific index of the current list
    public void remove(int index) {
        //if the index is less than 0 or greater than the size - 1 , then throw an exception
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        //now check where in the list the index is to be removed from. is it in the first? re-organise so that the old 2nd node becomes the first, and that the old 2nd previous link is set to null.
        if (index == 0) {
            //if there was only one element in the list then also set last = null
           first = first.getNext();
           if (first == null) {
            last = null;
        } else {
            first.setPrev(null);
        }
    } else if (index == size() - 1) {
        last = last.getPrev();
        last.setNext(null);
    } else {
        DLLNode<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        DLLNode<T> pred = current.getPrev();
        DLLNode<T> succ = current.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
    }
}

//method to get the first node
    public DLLNode<T> getFirst() {
        return first;
    }
    public void setFirst(DLLNode<T> first) {
        this.first = first;
    }

    public DLLNode<T> getLast() {
        return last;
    }
    public void setLast(DLLNode<T> last) {
        this.last = last;
    }

    @Override
    public String toString() {
    String output;
    DLLNode<T> p = first;
    output = "LinkedListDLL ";
    while(p != null) {
        output += p.getElement().toString() + ", ";
        p = p.getNext();
    }
    return output;
}

}
