package STEP1.PatternProgram;
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern13 {
    static void pattern13(int n){
        int number = 1;
        for(int i=1; i<=n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        pattern13(n);
    }
}
