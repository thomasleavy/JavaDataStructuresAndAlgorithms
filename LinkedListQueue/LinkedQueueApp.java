package LinkedListQueue;

public class LinkedQueueApp {
   
    public static void main(String[] args) {
        //instantiate linked list queue
        LinkedQueue<String> queue = new LinkedQueue<>();

        //enqueue 3 string into queue
        queue.enqueue("Thomas");
        queue.enqueue("Jill");
        queue.enqueue("Ann");

        System.out.println("Names in queue after enqueuing:");
        System.out.println(queue);

        //show queue size
        System.out.printf("Queue size: %d%n", queue.size());

        //get rid of 2 elements from queue
        queue.dequeue();
        queue.dequeue();

        //show queue's size
        System.out.printf("New queue size after people have been dequeued: %d%n", queue.size());
    }
}
