public class binarySearchTree implements iBinaryTree {
  //instance variable
  public btNode root = null;

//check if tree is empty by verifying if root node is null or not
  @Override
  public boolean isEmpty() {
    return (root == null);
  }
//return number of elements in tree, if empty, return 0
  @Override
  public int size() {
    if (isEmpty())
      return 0;
//otherwise return size
    return size(root);
  }

//private recursive method to traverse the tree and count the number of nodes present
  private int size(btNode currentNode) {
    if (currentNode == null)
      return 0;
    else
      return 1 + size(currentNode.left) + size(currentNode.right);
  }

  //insert an element into the tree
  @Override
  public void insert(int element) {
    System.out.println("Inserting: " + element);
    if (isEmpty()) {
      //must be able to insert at the root level
      root = new btNode(element);
    } else {
      insert(element, root);
    }
  }
//and a private recursive method where elements can be inserted elsewhere.
  private void insert(int element, btNode currentNode) {
    System.out.printf("\tcomparing insert value %d with %d%n", element, currentNode.element); //compare value to be inserted with current node's 
    //value and traverses left/right until it
    //finds right position in the tree
    if (element < currentNode.element) {
      if (currentNode.left == null) {
        //if inserted node is 0, message saying left is null
        System.out.printf("\tinsert %d, %d.left is null%n", element, currentNode.element);
        currentNode.left = new btNode(element);
      } else {
        //if it's not null but smaller, messsgae is printed
        System.out.printf("\t%d is smaller than %d => go left%n", element, currentNode.element);
        insert(element, currentNode.left);
      }
    } else {
      //this is the same as the above. this is for the right node instead
      if (currentNode.right == null) {
        System.out.printf("\tinsert %d, %d.right is null%n", element, currentNode.element);
        currentNode.right = new btNode(element);
      } else {
        System.out.printf("\t%d is larger than %d => go right%n", element, currentNode.element);
        insert(element, currentNode.right);
      }
    }
  }
//method to traverse the tree and print each node's value
  @Override
  public void traverse() {
    traverse(root);
  }
//use a private recursive method to traverse the tree in order
  private void traverse(btNode currentNode) {
    if (currentNode == null)
      return;

    traverse(currentNode.left);

    System.out.println("Current: " + currentNode);

    traverse(currentNode.right);
  }

  //find and return max values in binary search tree.
  @Override
  public int findMax() {
    if (isEmpty()) {
      System.out.println("The tree is empty");
      return -1;
    } else {
      return findMax(root);
    }
  }

  private int findMax(btNode currentNode) {
    if (currentNode.right == null)
      return currentNode.element;
    else
      return findMax(currentNode.right);
  }

  //same as above, but this time for min
  @Override
  public int findMin() {
    if (isEmpty()) {
      System.out.println("The tree is empty");
      return -1;
    } else {
      return findMin(root);
    }
  }

  private int findMin(btNode currentNode) {
    if (currentNode.left == null)
      return currentNode.element;
    else
      return findMin(currentNode.left);
  }

  //check if given element exists in binary search tree
  @Override
  public boolean contains(int element) {
    if (isEmpty()) {
      System.out.println("The tree is empty");
      return false;
    }
    return contains(element, root);
  }
 //private recursive methos to determine whether a certain element is in the tree and rooted at current node.
  private boolean contains(int element, btNode currentNode) {
    //base case
    if (currentNode == null)
      return false;

    System.out.print("Compare: " + currentNode.toString() + ", ");

    if (element == currentNode.element) { // There is a match
      System.out.println("matched:" + element);
      return true;
    } else if (element < currentNode.element) { // smaller than => go left...
      System.out.println("smaller => go left");
      return contains(element, currentNode.left);
    } else { // greater than => go right...
      System.out.println("greater => go right");
      return contains(element, currentNode.right);
    }
  }

  @Override
  public btNode find(int element) {
    if (isEmpty()) {
      System.out.println("The tree is empty");
      return null;
    }
    return find(element, root);
  }

  //find and return node containing given element in tree
  //return node, NOT boolean value. it is a bit like the contains() method but that one returns a boolean value true or false.
  private btNode find(int element, btNode currentNode) {
    if (currentNode == null)
      return null;

    System.out.print("Find: " + currentNode.toString() + ", ");

    if (element == currentNode.element) {
      System.out.println("found:" + element);
      return currentNode;
    } else if (element < currentNode.element) {
      System.out.println("smaller => go left");
      return find(element, currentNode.left);
    } else {
      System.out.println("greater => go right");
      return find(element, currentNode.right);
    }
  }

  //remove method
  @Override
  public boolean remove(int element) {
    throw new UnsupportedOperationException("Not supported yet");
  }
}
