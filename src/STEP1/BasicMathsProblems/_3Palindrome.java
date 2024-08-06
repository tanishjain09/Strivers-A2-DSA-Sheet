package STEP1.BasicMathsProblems;

public class _3Palindrome {
    static int reverseNum(int n){
        int digit;
        int reverseNum = 0;
        while (n != 0){
            digit = n%10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return reverseNum;
    }
    static void palindrome(int n){
        if(n == reverseNum(n)) System.out.println("Number is palindrome");
        else System.out.println("Number is not palindrome");
    }

    public static void main(String[] args) {
        int n = 12190;
        palindrome(n);
    }
}
