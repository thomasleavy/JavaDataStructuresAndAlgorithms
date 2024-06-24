//A Doubly Linked List is a linear data structure. This is a sequential collection of elements.

package DoublyLinkedList;
public class LinkedListDLLApp {
    public static void main(String[] args) {
        LinkedListDLL<String> linkedDL = new LinkedListDLL<String>();
    System.out.println("Start of linked list");
    System.out.println("Is the DLL linkedDL empty " + linkedDL.isEmpty());
    System.out.println("The size of DLL linkedDL = " + linkedDL.size());
    System.out.println("******Add node Bill to the linked list"); linkedDL.add("Bill");
    System.out.println("DLL size = " + linkedDL.size());
    System.out.println("DLL.first = " + linkedDL.getFirst());
    System.out.println("DLL.last = " + linkedDL.getLast());
    System.out.println("***** Add node Thomas to the linked list");
    linkedDL.add("Thomas");
    System.out.println("DLL size = " + linkedDL.size());
    System.out.println("DLL.first = " + linkedDL.getFirst());
    System.out.println("DLL.last = " + linkedDL.getLast());
    System.out.println("DLL contents: " + linkedDL.toString());
    System.out.println("***Add node Harry to the linked list"); linkedDL.add("Harry");
    System.out.println("DLL size = " + linkedDL.size());
    System.out.println("DLL.first = " + linkedDL.getFirst());
    System.out.println("DLL.last = " + linkedDL.getLast());

    //now I will demonstrate list traversal by printing out the list
    System.out.println("DLL contents: " + linkedDL.toString());
    }

}
