package ArrayListAndStack;

public class ArrayStackApp {
    public static void main(String[] args) {
        
    
        //instantiate the stack
        ArrayStack <String> stack = new ArrayStack(5);
        System.out.println(stack.toString());
    
        //add names
        stack.push("Alan");
        System.out.println(stack.toString());
    
        stack.push("Bob");
        System.out.println(stack.toString());
    
        stack.push("Jacob");
        System.out.println(stack.toString());
    
        stack.push("Thomas");
        System.out.println(stack.toString());
    
        String popped = stack.pop();
        System.out.println("We popped: " + popped + " Leaving: " + stack.toString());
        
        String peeked = stack.peek();
        System.out.println("We peeked: " + peeked + " Leaving: " + stack.toString());
    
        stack.push("Harry");
        stack.push("Frank");
    }    
}
