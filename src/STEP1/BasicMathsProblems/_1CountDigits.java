package STEP1.BasicMathsProblems;

public class _1CountDigits {
    static void countDigit(int n){
        int count = 0;
        while(n != 0){
            count ++;
            n = n/10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 100000;
        countDigit(n);
    }
}
