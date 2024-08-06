package STEP1.BasicMathsProblems;

public class _6PrintAllDivisors {
    static void printAllDivisors(int n){
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
        printAllDivisors(n);
    }
}
