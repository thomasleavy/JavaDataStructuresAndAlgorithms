//node class
public class btNode {
  // variables
  public int element; // hold integer values associated with node
  public btNode left; //left child node
  public btNode right;//right child node

  //constructor
  public btNode(int element) {
    this.element = element; 
    //set left and right child to null
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    String leftVal, rightVal; //if the left or right child is null then null is shown instead of child's values

    //if statement
    if (left == null) //if null
      leftVal = "null";
    else
      leftVal = Integer.toString(left.element);
    if (right == null)
      rightVal = "null";
    else
      rightVal = Integer.toString(right.element);
//put root in middle, left child value and right child value, for example, 3 <- 5 -> 6
    return String.format("%s <- %s -> %s", leftVal, element, rightVal);
  }
}
