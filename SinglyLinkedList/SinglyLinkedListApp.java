//linked lists in java
//these are data structures for storing a collection of items. they store things a bit differently to arrayLists.
//in essence, if you need fast, random access and the size of the list doesn't change often, ArrayList might be more suitable. If you have frequent insertions or deletions and the list size can vary, LinkedList might be a better choice.

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
    
        //Add names to list
        linkedList.addAtIndex(0, "Thomas");
        linkedList.addAtIndex(1, "David");
        linkedList.addAtIndex(2, "Denis");
        linkedList.addAtIndex(3, "Dave");
    
        //print info about the linked list
        System.out.println("Linked List size: " + linkedList.size());
        System.out.println("The first element in the list is - " + linkedList.getFirstNode().element);
        System.out.println("The last element in the list is - " + linkedList.getLastNode().element);
    }
}
