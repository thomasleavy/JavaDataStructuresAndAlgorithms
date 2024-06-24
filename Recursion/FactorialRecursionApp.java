package Recursion;

public class FactorialRecursionApp {
    public static void main(String[] args) {
        int n = 5;
        int factorial;

        factorial = FactorialRecursion.factorial(n);
        System.out.printf("%d factorial = %d%n", n, factorial);
    }
} 
