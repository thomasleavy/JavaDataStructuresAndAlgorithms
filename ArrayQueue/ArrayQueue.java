package ArrayQueue;
//implement generics using type T <T>
public class ArrayQueue<T> implements InterfaceQueue<T> {
    
    private T[] items; //we need array of objects
    private int queueCount; //this will show number of elements currently in the queue
    public int maxSize; //this will show max size of elements that fit on queue
    
    /*
    *@overloaded constructor to allow the queue collection to be initialised
    *
    *@param maxSize number of elements the queue will be able to hold
    */
    public ArrayQueue (int maxSize) {
        //if there are 3 member variables (see above), 
        //there is a good chance you will also need 3 
        //sets of things in the constructor method
        this.maxSize = maxSize;
        items = (T[]) new Object[this.maxSize];//instantiate space of maxSize for the items array and typecast
        this.queueCount = 0;
    }

    public int size() {

        return queueCount;
    }

    public boolean isEmpty() {

        if (queueCount == 0 )  return true;
        else return false;
    }

    public void enqueue(T element) {
        
        //have to check if element is null
        if(element == null) {
            throw new NullPointerException("Null element passed to enqueue");
        }

        //have to check if queue is full
        if (queueCount >= maxSize) {
            throw new IndexOutOfBoundsException("Queue's full");
        }

        //can add onto queue
        //1. add element at position in the array indicated by queueCount
        items[queueCount] = element;
        //increment it
        queueCount++;

    }

    public T dequeue() {

        //checdk for these error conditions:
        //check if queue is empty
        if (queueCount == 0) {

            //TO DO index out of bounds is not exactly the right exception below
            //throw new IndexOutOfBoundsException("queue is empty");
            //so let's use something differen that uses the emptyQueueException.java class
            throw new EmptyQueueException("queue is empty");
        }
        //steps
        //1. create a temporary variable to hold the element at the front of the queue
        //2. queue requires first item on the queue to be the first off the queue. 
        //this means we'll always dequeue from index == 0 in the array

        //element = items at index position 0
        T element = items[0];

        //we must shift each element in the array one place to the left. let's use a for loop
        for(int index = 0; index < queueCount; index++) {
                items[index] = items[index+1];
        }

        //4.let's decrement the count
        queueCount--;

        return element;
    }

    public T peek() {

        //check for errors
        if(queueCount == 0 ) {
            throw new EmptyQueueException("Queue is empty");
        }
        //create temp variable to hold the element at front of queue
        //

        return items[0];
    }

    public String toString() {
        String str = "FRONT[";
        for(int index = 0; index < queueCount; index++) {
            str += " " + items[index];

        }
        return str += "]BACK";
    }

}   
