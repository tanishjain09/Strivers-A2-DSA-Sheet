package STEP1.BasicRecursion;

public class Factorial {
    static long factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 34;
        long fact = factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
