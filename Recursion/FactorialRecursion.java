package Recursion;

public class FactorialRecursion {
    public static int factorial(int n) {
//base case
 if (n == 0) {
    return 1;
 }
 else {
    return n + factorial(n-1);
 }
//recursive case
    }
}
