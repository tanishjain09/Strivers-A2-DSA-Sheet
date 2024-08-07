package STEP1.BasicRecursion;

public class _1ToN {
    static void _1To_n(int n){
        if(n == 0){
            return;
        }
        _1To_n(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        _1To_n(5);
    }
}
