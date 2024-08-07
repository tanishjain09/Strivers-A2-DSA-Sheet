package STEP1.BasicRecursion;

public class FibonacciSeries {
    static int fibonacciSeries(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println("0th to Nth fibonacci series is:");
        for (int i = 0; i <=5 ; i++) {
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
}
