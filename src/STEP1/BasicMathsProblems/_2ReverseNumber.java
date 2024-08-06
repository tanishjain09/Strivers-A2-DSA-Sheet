package STEP1.BasicMathsProblems;

public class _2ReverseNumber {
    static void reverseNum(int n){
        int digit;
        int reverseNum = 0;
        while (n != 0){
            digit = n%10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        int n =12345;
        reverseNum(n);
    }
}
