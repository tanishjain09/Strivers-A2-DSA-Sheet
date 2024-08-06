package STEP1.PatternProgram;
/*
A B C D E
A B C D
A B C
A B
A
 */
public class Pattern15 {
    static void pattern15(int n){
        for(int i=n; i>0; i--){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern15(n);
    }
}
