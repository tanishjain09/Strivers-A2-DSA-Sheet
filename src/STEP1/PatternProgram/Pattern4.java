package STEP1.PatternProgram;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
 */

public class Pattern4 {
    static void pattern4(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern4(n);
    }
}
