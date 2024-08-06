package STEP1.PatternProgram;
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class Pattern6 {
    static void pattern6(int n){
        for(int i = n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern6(n);
    }
}
