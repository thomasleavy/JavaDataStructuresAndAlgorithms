package LinkedListQueue;

public class LinkedQueue<T> implements iQueue<T> {
    
    //define instance variables
    private Node<T> front; 
    private Node<T> back; 
    private int queueCount;
    
    //constructor
    public LinkedQueue() {
        front = null;
        back = null;
        queueCount = 0;
    }

    @Override
    public void enqueue(T element) {
        //create new node for linkedlist
        Node<T> newNode = new Node<>(element);

        //if queue is empty, set front and back to new node
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        }
        else {
            back.next = newNode;
            back = newNode;
        }

        //increment queue count ++
        queueCount++;
    }

    @Override
    public T dequeue() {
        //check if queue's empty
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }

        // Get information from front node
        T info = front.info;

        // Move front pointer to the next node
        front = front.next;

        // If front becomes null, update rear to null as well
        if (front == null) {
            back = null;
        }

        // Decrement queue count
        queueCount--;

        return info;
    }

    @Override
    public int size() {
        return queueCount;
    }

    @Override
    public T peek() {
        // Check if queue is empty
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }

        // Return data from the front node
        return front.info;
    }


    public boolean isEmpty() {
        return queueCount == 0;
    }

    public String toString() {
        String str = "FRONT[";
        Node<T> current = front;
        while (current != null) {
            str += " " + current.info;
            current = current.next;
        }
        str += "]BACK";
        return str;
    }
}
