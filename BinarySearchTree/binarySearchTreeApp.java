public class binarySearchTreeApp {
  public static void main(String[] args) {
    //create instance of binarySearchTree named integers
    binarySearchTree integers = new binarySearchTree();

    System.out.println("isEmpty: " + integers.isEmpty()); //print results if empty
    System.out.println("Tree size: " + integers.size()); //size and num of elements in tree
    integers.insert(12); //insert 12 as value into the tree
    System.out.println("isEmpty: " + integers.isEmpty()); //same as above with 12 in it
    System.out.println("Tree size: " + integers.size());
//insert integers
    integers.insert(4);
    integers.insert(34);
    integers.insert(100);
    integers.insert(2);
//tree information after the above ^ has been inserted
    System.out.println("isEmpty: " + integers.isEmpty()); 
    System.out.println("Tree size: " + integers.size());

    System.out.println("In order:");
    integers.traverse();
//print max and min values in the binary search tree
    System.out.println("Max value: " + integers.findMax());
    System.out.println("Min value: " + integers.findMin());
  }
}
