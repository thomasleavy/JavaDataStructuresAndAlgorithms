package ArrayQueue;

public class EmptyQueueException extends RuntimeException{
    //base constructor
 public EmptyQueueException() {
         super ("There's nothing in the queue");
     }

     //overloaded constructor
     public EmptyQueueException(String message) {
         super (message);
     }
}
