package STEP1.BasicMathsProblems;

public class _5ArmstrongNumbers {
    static int countDigit(int n){
        int count = 0;
        while(n != 0){
            count ++;
            n = n/10;
        }
        return count;
    }
    static boolean armstrongNumber(int n){
        int numOfDigit = countDigit(n);
        int num = n;
        int sum = 0;
        while (n != 0){
            int digit = n%10;
            sum += (int) Math.pow(digit,numOfDigit);
            n /= 10;

        }
        if(sum == num) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 1593;
        System.out.println(armstrongNumber(n));
    }
}
