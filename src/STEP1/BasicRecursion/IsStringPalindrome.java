package STEP1.BasicRecursion;

public class IsStringPalindrome {
    static boolean isPalindrome(int i,String str){
        int n = str.length();
        if(i >= n/2) return true;
        if(str.toLowerCase().charAt(i)!= str.toLowerCase().charAt(n-i-1)) return false;
        return isPalindrome(i+1,str);
    }
    public static void main(String[] args) {
        String str = "totp";
        System.out.println(isPalindrome(0,str));
    }
}
