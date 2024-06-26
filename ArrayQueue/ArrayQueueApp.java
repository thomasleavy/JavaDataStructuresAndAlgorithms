package ArrayQueue;

public class ArrayQueueApp {
    public static void main(String[] args) {
        //instantiate array class
        ArrayQueue<String> queue = new ArrayQueue(5);
 
 //below commented out code would throw an exception
 //queue.dequeue();
 
        queue.enqueue("Thomas");
        System.out.printf("Enqueue[%d]: %s%n", queue.size(), queue.toString());
 
         String peekVal = queue.peek();
         System.out.printf("Dequeue[%s] [%d]: %s%n", peekVal, queue.size(), queue.toString());
         
        queue.enqueue("Jill");
        System.out.printf("Enqueue[%d]: %s%n", queue.size(), queue.toString());
 
        queue.enqueue("Ann");
        System.out.printf("Enqueue[%d]: %s%n", queue.size(), queue.toString());
 
        queue.dequeue();
        System.out.printf("Dequeue[%d]: %s%n", queue.size(), queue.toString());
 
        queue.enqueue("David");
        System.out.printf("Enqueue[%d]: %s%n", queue.size(), queue.toString());
 
        peekVal = queue.dequeue();
        System.out.printf("Dequeue [%s] [%d]: %s%n", peekVal, queue.size(), queue.toString());
        //the below code is used to show that an error exception would be thrown if it was used
        //queue.enqueue(null);
        //System.out.printf("Enqueue[%d]: %s%n", queue.size(), queue.toString());
         
        //also if you had more than 5 in the queue, it would overflow and there'd be an IndexOutOfBoundsException error thrown
     }
 }

