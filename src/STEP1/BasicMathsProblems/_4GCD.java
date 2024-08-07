package STEP1.BasicMathsProblems;

public class _4GCD {
    static int gcd(int a,int b){
        while(a > 0 && b>0){
            if(a > b) a = a%b;
            else b = b%a;
        }
        if(a==0) return b;
        else return a;
    }

    public static void main(String[] args) {
        int a=15,b=5;
        int ans = gcd(a,b);
        System.out.println("The GCD of a and b is "+ ans);
    }
}
