package LinkedListQueue;

public interface iQueue<T> {
    /*methods are enqueue and dequeue. 
    *optional ones are size and peek
    */
    //enqueue will add an element to the front of the queue
    //@return void
    //@param the element to be enqueued
    //this is an abstract method, i leave how it works, to the class.
    public void enqueue(T element);

    //dequeue - this removes an element from the front of the queue
    //it returns that object as the value from this method
    //@return the element
    public T dequeue();

    //size - this returns the number of elements currently on the queue
    //return the number of elements on the queue
    public int size();

    //peek - this reads the object at front of queue without dequeueing (removing) it
    //@return the value of the element at the front of the queue
    public T peek();

    //isEmpty - returns true if queue is empty
    //@return true if queue is empty
    public boolean isEmpty();
}