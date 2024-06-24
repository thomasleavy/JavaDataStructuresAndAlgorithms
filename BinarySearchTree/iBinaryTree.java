public interface iBinaryTree {
  // methods for interface
  public boolean isEmpty(); // show if binary tree is empty or not

  public int size(); // show size

  public void insert(int element); // insert new element into binary tree

  public void traverse(); // traverse the tree

  public int findMax(); // find max value in tree

  public int findMin(); // find min value

  public boolean contains(int element); // check if tree contains specific element

  public btNode find(int element); // find and return node containing particular element

  public boolean remove(int element); // remove a node containing specific element
}
