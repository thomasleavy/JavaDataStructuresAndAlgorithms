package ArrayListAndStack;

    import java.util.Arrays;

public class ArrayStack<T> implements InterfaceStack<T> {
    //add variables
    public T[] items; //these are items to hold in the stack
    public int maxSize; //the max size the array can hold
    public int topIndex; //a count of the number of elements currently on the stack

    //add constructos(s)
public ArrayStack(int maxSize) {
    this.maxSize = maxSize;
    this.items = (T[])new Object[this.maxSize];
    this.topIndex = 0;
}
//helper methods
public int size() {
    return topIndex;
}

@Override 
public String toString() {
    String str = "TOP [";
    for(int i = topIndex-1; i >= 0; i--) {
str += " " + items[i];
    }
    return str + "] BOTTOM";

}

//let's double the size of the array using the below helper method
public int reallocate() {
    maxSize *= 2;
    items = Arrays.copyOf(items, maxSize);
    return maxSize;
}

    //sub out the x3 interface methods
    public void push(T element) {
        if(topIndex >= maxSize) {
            System.out.println("Stack is running out of space, reallocate items array");
            reallocate();
            throw new IndexOutOfBoundsException("Stack is full");
        }
        else if (element == null) {
            throw new NullPointerException();
        }
        else {
            items[topIndex] = element;
            topIndex++;
        }
    }

 public T pop() {
    
    //helper function
    if(topIndex == 0) {
        throw new IndexOutOfBoundsException("Stack is empty");
    }
    else {
        //take a copy of an item at the top of the stack
        T element = items[topIndex-1];

        //remove item at top of stack. when I push, I will override the item anyway
        topIndex--;

        return element;
    }
 }
//the syntax for peek is very similar to pop
public T peek() {
if (topIndex == 0) {
    throw new IndexOutOfBoundsException("Stack is empty");
} else {
    T element = items[topIndex -1];

    //I'm only looking at the top value, I dont remove it from the stack, so I dont decrement topIndex "topindex--;"
    topIndex--;
    return element;
        }
    }
}
