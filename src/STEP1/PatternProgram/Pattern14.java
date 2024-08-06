package STEP1.PatternProgram;
/*
A
A B
A B C
A B C D
A B C D E
 */
public class Pattern14 {
    static void pattern14(int n){

        for (int i = 1; i <= n ; i++) {
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        pattern14(n);
    }
}
