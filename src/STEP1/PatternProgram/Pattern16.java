package STEP1.PatternProgram;
/*
A
B B
C C C
D D D D
E E E E E
 */
public class Pattern16 {
    static void pattern16(int n){
        char ch = 'A';
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(ch +" ");
                }
                System.out.println();
                ch++;
            }
        }

    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }
}

